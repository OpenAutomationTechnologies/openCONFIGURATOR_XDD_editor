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
 * @author Joris Lückenga
 * @brief Writes to the Status Bar of Eclipse-Workbench This class is not used
 *        yet
 * @since 19.3.2013
 * */
public class StatusBarWriter {
    /**
     * @brief Method to write a message to the status bar
     * @param message
     *            that should be written to statusbar (black)
     * @param error
     *            that should be written to statusbar (red)
     */
    public static void writeToStatus(final String message, final boolean error) {
        final Display display = Display.getDefault();

        display.syncExec(new Runnable() { // NOPMD by lueckengaj on 29.03.13 13:35
                /*
                * (non-Javadoc)
                *
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
                    if (error)
                        statusLineManager.setErrorMessage(message);
                    else
                        statusLineManager.setMessage(message);
                }
            });
    } //WriteToStatus
} //StatusBarWriter
