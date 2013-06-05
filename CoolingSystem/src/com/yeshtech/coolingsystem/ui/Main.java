package com.yeshtech.coolingsystem.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Main {

	private JFrame frmCoolingSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCoolingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoolingSystem = new JFrame();
		frmCoolingSystem.setTitle("Cooling System");
		frmCoolingSystem.setBounds(100, 100, 743, 504);
		frmCoolingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCoolingSystem.setJMenuBar(menuBar);
		
		JMenu mn_file = new JMenu("File");
		menuBar.add(mn_file);
		
		JMenuItem mntm_file_OpenProject = new JMenuItem("Open Project");
		mn_file.add(mntm_file_OpenProject);
		
		JMenuItem mntm_file_NewProject = new JMenuItem("New Project");
		mn_file.add(mntm_file_NewProject);
		
		JMenuItem mntm_file_SaveProject = new JMenuItem("Save Project");
		mn_file.add(mntm_file_SaveProject);
		
		JMenu mn_Options = new JMenu("Options");
		menuBar.add(mn_Options);
		
		JMenuItem mntm_options_DataCenterOptions = new JMenuItem("Data Center Options");
		mn_Options.add(mntm_options_DataCenterOptions);
		
		JMenu mn_Execute = new JMenu("Execute");
		menuBar.add(mn_Execute);
		
		JMenuItem mntm_execute_Run = new JMenuItem("Run");
		mn_Execute.add(mntm_execute_Run);
		
		JMenuItem mntm_excute_PostProcess = new JMenuItem("Post Process");
		mn_Execute.add(mntm_excute_PostProcess);
		
		JMenu mn_Help = new JMenu("Help");
		menuBar.add(mn_Help);
		
		JMenuItem mntm_help_vatasMannual = new JMenuItem("VTAS Mannual");
		mn_Help.add(mntm_help_vatasMannual);
		
		JMenuItem mnt_help_about = new JMenuItem("About\r\n");
		mn_Help.add(mnt_help_about);
	}

}
