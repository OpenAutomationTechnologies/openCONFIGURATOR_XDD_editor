/*******************************************************************************
 * @file   ValidateFirmwareWizardPage.java
 *
 * @author Sree Hari Vignesh, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2017, Kalycito Infotech Private Limited
 *                    All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the copyright holders nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

package com.br_automation.buoat.xddeditor.XDD.wizards;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.xml.sax.InputSource;

import com.br_automation.buoat.xddeditor.XDD.DocumentRoot;
import com.br_automation.buoat.xddeditor.XDD.custom.FirmwareUtilities;
import com.br_automation.buoat.xddeditor.editor.editors.DeviceDescriptionFileEditor;

import FwSchema.FirmwareType;

/**
 * Wizard page to validate the firmware header parameters with XDD file
 *
 * @author Sree Hari Vignesh
 *
 */
public class ValidateFirmwareWizardPage extends WizardPage {

    protected ValidateFirmwareWizardPage(String pageName, DocumentRoot documentRoot,
            DeviceDescriptionFileEditor editor) {
        super(pageName);
        this.documentRoot = documentRoot;
        this.editor = editor;
        setTitle(DIALOG_PAGE_LABEL);
        setDescription(DIALOG_DESCRIPTION);

    }

    private DeviceDescriptionFileEditor editor;

    private DocumentRoot documentRoot;

    private FwSchema.DocumentRoot firmwareDocumentRoot;

    public static final String DIALOG_DESCRIPTION = "Add firmware to device description file.";
    public static final String DIALOG_PAGE_LABEL = "Firmware";
    private static final String FIRMWARE_FILE_LABEL = "Firmware File";
    private static final String DEFAULT_CONFIGURATION_LABEL = "Choose a firmware file";

    private static final String BROWSE_CONFIGURATION_LABEL = "Browse...";
    private static final String IMPORT_FIRMWARE_FILE_DIALOG_LABEL = "Import firmware file for the device.";
    private static final String ERROR_CHOOSE_VALID_FILE_MESSAGE = "Choose a valid firmware file.";
    private static final String ERROR_CHOOSE_VALID_PATH_MESSAGE = "Firmware file does not exist in the path: ";
    private static final String VALID_FILE_MESSAGE = "Firmware file {0} is valid for the device.";

    private static final String[] FIRMWARE_FILTER_EXTENSIONS = { "*.fw" };

    private static final String[] CONFIGURATION_FILTER_NAMES_EXTENSIONS = { "Firmware files (*.fw)" };

    private static final String ERROR_PRAM_VALIDATION_FAILED_HEADER = "{0} does not match.";
    private static final String ERROR_PRAM_VALIDATION_FAILED_DETAIL_NODE = "Firmware file {0} with {1} {2} does not match with the {1} {4} value {3} of the device.";
    private static final String ERROR_XDD_PARAM_NOTFOUND = "Validation parameter {0} is missing in the device.";

    private static final String VENDOR_ID = "vendor ID";
    private static final String PRODUCT_CODE = "product code";

    private static boolean isFirmwareConfigurationValid(final String firmwarePath) {
        boolean retVal = false;
        if ((firmwarePath == null) || (firmwarePath.isEmpty())) {
            return retVal;
        }

        File file = new File(firmwarePath);
        retVal = file.isFile();

        return retVal;
    }

    /**
     * Control to display the firmware configuration path.
     */
    private Text firmwareConfigurationPath;

    /**
     * Control to display the xdd error message.
     */
    private StyledText errorinfo;

    private String fileName = StringUtils.EMPTY;

    /**
     * Browse XDD/XDC button.
     */
    private Button btnBrowse;

    /**
     * Default radio button.
     */
    private Button btnfirmware;

    private Group grpFirmwareFile;

    // Firmware configuration path listener
    private ModifyListener firmwareConfigurationPathModifyListener = new ModifyListener() {
        @Override
        public void modifyText(ModifyEvent e) {
            setErrorMessage(null);
            getInfoStyledText("");
            setPageComplete(true);
            if (!isFirmwareConfigurationValid(firmwareConfigurationPath.getText())) {
                setErrorMessage(ERROR_CHOOSE_VALID_FILE_MESSAGE);
                setPageComplete(false);
            }

            firmwareConfigurationPath.setToolTipText(firmwareConfigurationPath.getText());
            getWizard().getContainer().updateButtons();

        }
    };

    /**
     * Create contents of the wizard.
     *
     * @param parent
     *            Parent composite
     */
    @Override
    public void createControl(Composite parent) {

        FormToolkit formToolkit = new FormToolkit(Display.getDefault());
        Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new FillLayout(SWT.VERTICAL));
        setControl(container);
        Composite composite = new Composite(container, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));

        Composite composite_2 = new Composite(composite, SWT.NONE);
        composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));

        Composite headerFrame = new Composite(composite_2, SWT.BORDER);
        headerFrame.setLayout(new GridLayout(1, false));

        grpFirmwareFile = new Group(headerFrame, SWT.NONE);
        GridData gd_grpConfigurationFile = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gd_grpConfigurationFile.widthHint = 558;
        grpFirmwareFile.setLayoutData(gd_grpConfigurationFile);
        grpFirmwareFile.setText(FIRMWARE_FILE_LABEL);
        grpFirmwareFile.setLayout(new GridLayout(4, false));

        btnfirmware = new Button(grpFirmwareFile, SWT.RADIO);
        btnfirmware.setText(DEFAULT_CONFIGURATION_LABEL);
        btnfirmware.setSelection(true);

        firmwareConfigurationPath = new Text(grpFirmwareFile, SWT.BORDER);
        GridData gd_firmwareConfigurationPath = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
        gd_firmwareConfigurationPath.widthHint = 436;
        firmwareConfigurationPath.setLayoutData(gd_firmwareConfigurationPath);
        firmwareConfigurationPath.setToolTipText(firmwareConfigurationPath.getText());
        firmwareConfigurationPath.addModifyListener(firmwareConfigurationPathModifyListener);
        firmwareConfigurationPath.addModifyListener(firmwareConfigurationPathModifyListener);

        btnBrowse = new Button(grpFirmwareFile, SWT.NONE);
        btnBrowse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        btnBrowse.setText(BROWSE_CONFIGURATION_LABEL);

        btnBrowse.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {

                FileDialog fileDialog = new FileDialog(getContainer().getShell(), SWT.OPEN);

                fileDialog.setText(IMPORT_FIRMWARE_FILE_DIALOG_LABEL);
                // Set filter on .fw files
                fileDialog.setFilterExtensions(FIRMWARE_FILTER_EXTENSIONS);
                // Put in a readable name for the filter
                fileDialog.setFilterNames(CONFIGURATION_FILTER_NAMES_EXTENSIONS);
                // Open Dialog and save result of selection
                String selectedFile = fileDialog.open();

                if (selectedFile != null) {
                    firmwareConfigurationPath.setText(selectedFile.trim());
                }
            }
        });

        TextViewer textViewer = new TextViewer(headerFrame, SWT.BORDER | SWT.WRAP | SWT.READ_ONLY);
        errorinfo = textViewer.getTextWidget();
        errorinfo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.paintBordersFor(errorinfo);
    }

    /**
     *
     * @return instance of text Viewer widget.
     */
    public StyledText getErrorStyledText(String message) {
        errorinfo.setForeground(new Color(Display.getDefault(), 255, 0, 0));
        errorinfo.setText(message);
        return errorinfo;
    }

    /**
     * Receive nodeConfiguration path.
     *
     * @return Path of nodeConfiguration.
     */
    public Path getFirmwareConfigurationPath() {
        return Paths.get(firmwareConfigurationPath.getText());
    }

    /**
     *
     * @return instance of text Viewer widget.
     */
    public StyledText getInfoStyledText(String message) {
        errorinfo.setForeground(new Color(Display.getDefault(), 46, 92, 39));
        errorinfo.setText(message);
        return errorinfo;
    }

    public boolean checkWithXddAttributes(DocumentRoot documentRoot, FwSchema.DocumentRoot firmwareDocumentRoot2) {

        String xddVendorId = editor.getVendorId();
        String xddProductCode = editor.getproductId();

        boolean isFirmwareVendorIdEmpty = true;
        long firmwareVen = 0;

        FirmwareType firmwareModel = firmwareDocumentRoot2.getFirmware();

        if (firmwareModel.getVen() != null) {
            isFirmwareVendorIdEmpty = firmwareModel.getVen().isEmpty();
        }

        if (!isFirmwareVendorIdEmpty) {
            firmwareVen = Long.decode(firmwareModel.getVen());
        }

        long firmwareDev = firmwareModel.getDev();

        if ((!xddVendorId.isEmpty()) && (!xddProductCode.isEmpty())) {
            if (Long.decode(xddProductCode) == firmwareDev) {
                if (!isFirmwareVendorIdEmpty) {
                    // vendor ID shall not be compared if
                    // firmware
                    // doesn't contain the variable 'Var'
                    if (Long.decode(xddVendorId) == firmwareVen) {
                        return true;
                    }
                    setErrorMessage(MessageFormat.format(ERROR_PRAM_VALIDATION_FAILED_HEADER, "Vendor ID"));
                    getErrorStyledText(MessageFormat.format(ERROR_PRAM_VALIDATION_FAILED_DETAIL_NODE,
                            "'" + fileName + "'", VENDOR_ID, "'" + firmwareModel.getVen() + "'",
                            "'" + xddVendorId + "'", "(0x1018/01)"));
                    return false;
                }
                return true;
            }
            setErrorMessage(MessageFormat.format(ERROR_PRAM_VALIDATION_FAILED_HEADER, "Product Code"));
            getErrorStyledText(MessageFormat.format(ERROR_PRAM_VALIDATION_FAILED_DETAIL_NODE, "'" + fileName + "'",
                    PRODUCT_CODE, "'" + firmwareDev + "'", "'" + Long.decode(xddProductCode) + "'", "(0x1018/02)"));

            return false;
        }
        if (xddVendorId.isEmpty()) {
            getErrorStyledText(MessageFormat.format(ERROR_XDD_PARAM_NOTFOUND, "'vendor ID'"));
        } else if (xddProductCode.isEmpty()) {
            getErrorStyledText(MessageFormat.format(ERROR_XDD_PARAM_NOTFOUND, "'product ID'"));
        }
        return false;

    }

    public synchronized FwSchema.DocumentRoot loadFirmwareFile(File firmwareFile, String newfirmwareFilePath) {
        try {
            InputSource input = null;
            BufferedReader bufferedRdr = null;
            FileOutputStream outputStream = null;

            try {

                bufferedRdr = new BufferedReader(new FileReader(firmwareFile));
                String firmwareline = StringUtils.EMPTY;
                int linesInFile = 3;
                for (int count = 0; count < linesInFile; count++) {
                    String readLine = bufferedRdr.readLine();
                    if (readLine != null) {
                        firmwareline = firmwareline.concat(readLine);
                        if (firmwareline.contains("/>")) {
                            break; // breaks the loop if firmware header is
                                    // closed
                        }
                    }
                }

                int firmwareStrtIndex = firmwareline.indexOf("<");
                int firmwareEndIndex = firmwareline.indexOf(">");
                // Receives only the header of firmware file.
                String firmwareHeader = firmwareline.substring(firmwareStrtIndex, firmwareEndIndex + 1);
                input = new InputSource(new StringReader(firmwareHeader));
                input.setSystemId(firmwareFile.toURI().toString());
                Reader reader = input.getCharacterStream();

                char[] charBuffer = new char[8 * 1024];
                StringBuilder builder = new StringBuilder();
                int numCharsRead;
                while ((numCharsRead = reader.read(charBuffer, 0, charBuffer.length)) != -1) {
                    builder.append(charBuffer, 0, numCharsRead);
                }
                InputStream targetStream = new ByteArrayInputStream(
                        builder.toString().getBytes(StandardCharsets.UTF_8));

                reader.close();
                targetStream.close();

                File newFile = new File(newfirmwareFilePath);

                // write the inputStream to a FileOutputStream
                outputStream = new FileOutputStream(newFile);

                int read = 0;
                byte[] bytes = new byte[1024];

                while ((read = targetStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }

                firmwareDocumentRoot = FirmwareUtilities.loadFirmware(newFile.toURI().toURL());

                bufferedRdr.close();
                outputStream.close();

                // return unmarshallFirmware(input);
            } catch (RuntimeException e) {
                if (bufferedRdr != null) {
                    bufferedRdr.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                throw e;
            } catch (Exception e) {
                if (bufferedRdr != null) {
                    bufferedRdr.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                e.printStackTrace();
            } finally {
                if (outputStream != null) {
                    outputStream.close();
                }
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return firmwareDocumentRoot;
    }

    public boolean validateXddModel() {

        getInfoStyledText("");
        File firmwareFile = new File(firmwareConfigurationPath.getText());
        fileName = firmwareFile.getName();
        boolean fileExists = firmwareFile.exists();

        java.nio.file.Path projectPath = editor.getProject().getLocation().toFile().toPath();

        String newfirmwareFilePath = projectPath.toString() + IPath.SEPARATOR + fileName;

        if (fileExists) {

            firmwareDocumentRoot = loadFirmwareFile(firmwareFile, newfirmwareFilePath);

            try {
                java.nio.file.Files.copy(firmwareFile.toPath(), new java.io.File(newfirmwareFilePath).toPath(),
                        java.nio.file.StandardCopyOption.COPY_ATTRIBUTES,
                        java.nio.file.StandardCopyOption.REPLACE_EXISTING, java.nio.file.LinkOption.NOFOLLOW_LINKS);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // Check node attribute with XDD
            if (!checkWithXddAttributes(documentRoot, firmwareDocumentRoot)) {
                return false;
            }

            String validFileMssg = MessageFormat.format(VALID_FILE_MESSAGE, "'" + firmwareFile.getName() + "'");
            getInfoStyledText(validFileMssg);

        } else {
            setErrorMessage(ERROR_CHOOSE_VALID_PATH_MESSAGE + firmwareConfigurationPath.getText());
            return false;
        }
        return true;

    }

    /**
     * Checks for error in the page
     *
     * @return page complete status.
     */
    @Override
    public boolean isPageComplete() {

        boolean firmwareConfigurationValid = isFirmwareConfigurationValid(firmwareConfigurationPath.getText());

        if (firmwareConfigurationPath.getText().isEmpty()) {
            setErrorMessage(ERROR_CHOOSE_VALID_FILE_MESSAGE);
            errorinfo.setBackground(new Color(Display.getDefault(), 240, 241, 241));
            errorinfo.setEnabled(false);

            return false;
        }
        errorinfo.setBackground(new Color(Display.getDefault(), 255, 255, 255));
        errorinfo.setEnabled(true);
        if (!firmwareConfigurationValid) {
            setErrorMessage(ERROR_CHOOSE_VALID_FILE_MESSAGE);
            return false;
        }

        boolean pageComplete = true;

        if (validateXddModel()) {
            pageComplete = true;
        } else {
            pageComplete = false;
        }

        return pageComplete;
    }

    public FwSchema.DocumentRoot getFirmwareDocument() {
        return firmwareDocumentRoot;
    }

}
