/*******************************************************************************
 * @file   PluginErrorDialogUtils.java
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

package com.br_automation.buoat.xddeditor.XDD.validation;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Utility class for the XDD Editor plugin for the error dialogs.
 *
 * @author Sree Hari Vignesh
 *
 */
public final class PluginErrorDialogUtils {

    public static final String INTERNAL_ERROR_MESSAGE = "An internal error occurred";

    /**
     * @return Return the active editor reference.
     */
    public static IEditorPart getActiveEditor() {
        IWorkbench iworkbench = PlatformUI.getWorkbench();
        if (iworkbench == null) {
            return null;
        }
        IWorkbenchWindow iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
        if (iworkbenchwindow == null) {
            return null;
        }
        IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
        if (iworkbenchpage == null) {
            return null;
        }

        return iworkbenchpage.getActiveEditor();
    }

    /**
     * Displays the message in a dialog.
     *
     * @param messageType
     *            The message type determines the image to be displayed.
     * @param message
     *            The message to be shown.
     * @param projectName
     *            The name of the project.
     */
    public static void showMessageWindow(int messageType, String message, String projectName) {
        MessageDialog.open(messageType, Display.getDefault().getActiveShell(), "Error", message, SWT.NONE);
    }
}
