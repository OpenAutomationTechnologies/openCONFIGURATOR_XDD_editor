/**
 * @since 19.3.2013
 * @author Joris Lückenga, Bernecker + Rainer Industrie Elektronik Ges.m.b.H.
 */

package com.br_automation.buoat.xddeditor.XDD.custom;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * @brief Class to support writing to Eclipse status bar.
 * 
 * @author Joris Lückenga
 * */
public class StatusBarWriter {
    /**
     * @brief Method to write a message to the Eclipse status bar.
     * @param message
     *            Default message that should be written to statusbar (black).
     * @param isError
     *            Error message that should be written to statusbar (red).
     */
    public static void writeToStatus(final String message, final boolean isError) {
        final Display display = Display.getDefault();

        display.syncExec(new Runnable() { // NOPMD by lueckengaj on 29.03.13 13:35

                /**
                 * @see java.lang.Runnable#run()
                 */
                @Override
                public void run() {

                    IWorkbench wb = PlatformUI.getWorkbench();
                    IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
                    IWorkbenchPage page = win.getActivePage();
                    IWorkbenchPart part = page.getActivePart();
                    IWorkbenchPartSite site = part.getSite();
                    IViewSite vSite = (IViewSite) site;

                    IActionBars actionBars = vSite.getActionBars();
                    if (actionBars == null)
                        return;
                    IStatusLineManager statusLineManager = actionBars.getStatusLineManager();
                    if (statusLineManager == null)
                        return;
                    if (isError)
                        statusLineManager.setErrorMessage(message);
                    else
                        statusLineManager.setMessage(message);
                }
            });
    } //WriteToStatus

} //StatusBarWriter
