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

//Writes to the Status Bar of Eclipse-Workbench
//This class is not used yet
public class StatusBarWriter {

    public static void writeToStatus(final String message, final boolean error) {
        final Display display = Display.getDefault();

        new Thread() {

            @Override
            public void run() {

                display.syncExec(new Runnable() {
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
            }
        }.start();
    }
}
