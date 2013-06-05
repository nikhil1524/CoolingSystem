package com.yeshtech.coolingsystem.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.SWT;

public class MainSWT {

	protected Shell shlCoolingsystem;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainSWT window = new MainSWT();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCoolingsystem.open();
		shlCoolingsystem.layout();
		while (!shlCoolingsystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCoolingsystem = new Shell();
		shlCoolingsystem.setSize(765, 530);
		shlCoolingsystem.setText("CoolingSystem");
		
		ViewForm viewForm = new ViewForm(shlCoolingsystem, SWT.NONE);
		viewForm.setBounds(0, 0, 737, 438);

	}
}
