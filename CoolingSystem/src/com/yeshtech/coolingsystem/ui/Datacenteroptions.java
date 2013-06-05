package com.yeshtech.coolingsystem.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

public class Datacenteroptions {

	protected Shell shell;
	private Text txtRunTransParaFinalStep;
	private Text txtRunTransParaFinalTime;
	private Text txtRunTransParaTimeStepVal;
	private Text txtRunTransRestartFileName;
	private Text txtLumpsPLPrintedLumps;
	private Text txtLumpsPLPrintedPaths;
	private Text txtSolnGSGlobalRelPara;
	private Text txtSolnGSGlobalSolnTol;
	private Text txtSolnGSMaxGlobIter;
	private Text txtSolnFSFlowRelPara;
	private Text txtSolnFSFlowSolnTol;
	private Text txtSolnFSMaxNumFlowIter;
	private Text txtSolnFSInitFlowRate;
	private Text txtSolnFSZeroFloorFlowVal;
	private Text txtSolnFSMinFlowRate;
	private Text txtConstWPSpecHeat;
	private Text txtConstWPDensity;
	private Text txtConstWPEnthWatVap;
	private Text txtConstAPSpecHeat;
	private Text txtConstAPDensity;
	private Text txtConstAPEnthWatVap;
	private Text text_2;
	private Text txtFansCFCreatedFans;
	private Text txtFansCSCreatedServers;
	private Text txtDataCenterAPTotalHeatGain;
	private Text txtDataCenterDCDXDim;
	private Text txtDataCenterDCDYDim;
	private Text txtDataCenterDCDZDim;
	private Text txtDataCenterDCDSubPlenHeight;
	private Text txtDataCenterDCDRetPlenHeight;
	private Text txtDataCenterGPExtHeatGain;
	private Text txtDataCenterGPNoRacks;
	private Text txtDataCenterGPR;
	private Text txtDataCenterGPFloorLeak;
	private Text txtDataCenterGPCeilLeak;
	private Text txtDataCenterGPFloorOpen;
	private Text txtDataCenterGPCeilOpen;
	private Text txtExtExtAirBulbTemp;
	private Text txtExtEAHRelHum;
	private Text txtExtEAHDuePoint;
	private Text txtExtEAHWetBulb;
	private Text txtExtEAHExtWatTemp;
	private Text txtIONotifyEverySteps;
	private Text txtIOPrintCriPrintEverySteps;
	private Text txtIOPrintCriPrintEveryS;
	private Text txtIOBaseName;
	private Text txtIONumSteps;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Datacenteroptions window = new Datacenteroptions();
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(575, 409);
		shell.setText("Data Center Options ");
		shell.setLayout(null);

		CTabFolder tabFolder = new CTabFolder(shell, SWT.BORDER);
		tabFolder.setBounds(0, 0, 559, 325);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		CTabItem chkboxRunOverriteComp = new CTabItem(tabFolder, SWT.NONE);
		chkboxRunOverriteComp.setText(" Run ");

		CTabItem tabItemIO = new CTabItem(tabFolder, SWT.NONE);
		tabItemIO.setText(" I / O ");

		CTabItem tabItemLumpsPaths = new CTabItem(tabFolder, SWT.NONE);
		tabItemLumpsPaths.setText(" Lumps / Paths ");

		CTabItem tabItemSolution = new CTabItem(tabFolder, SWT.NONE);
		tabItemSolution.setText(" Solution ");

		CTabItem tabItemConstants = new CTabItem(tabFolder, SWT.NONE);
		tabItemConstants.setText(" Constants ");

		CTabItem tabItemFansServers = new CTabItem(tabFolder, SWT.NONE);
		tabItemFansServers.setText(" Fans / Servers ");

		CTabItem tabItemDataCenter = new CTabItem(tabFolder, SWT.NONE);
		tabItemDataCenter.setText(" Data Center ");

		CTabItem tabItemExternal = new CTabItem(tabFolder, SWT.NONE);
		tabItemExternal.setText(" External ");

		Composite runComposite = new Composite(tabFolder, SWT.NONE);
		chkboxRunOverriteComp.setControl(runComposite);

		Composite ioComposite = new Composite(tabFolder, SWT.NONE);
		tabItemIO.setControl(ioComposite);
		
		Label label_17 = new Label(ioComposite, SWT.NONE);
		label_17.setText("Notify Every");
		label_17.setBounds(10, 13, 82, 15);
		
		txtIONotifyEverySteps = new Text(ioComposite, SWT.BORDER);
		txtIONotifyEverySteps.setBounds(98, 10, 211, 20);
		
		Label label_19 = new Label(ioComposite, SWT.NONE);
		label_19.setText("steps");
		label_19.setBounds(315, 13, 55, 15);
		
		Group grpIOInfoLevel = new Group(ioComposite, SWT.NONE);
		grpIOInfoLevel.setText("Information Level");
		grpIOInfoLevel.setBounds(10, 42, 323, 65);
		
		Combo comIOInfoLevel = new Combo(grpIOInfoLevel, SWT.NONE);
		comIOInfoLevel.setBounds(10, 20, 291, 20);
		
		Button chkBoxIOPrintRes = new Button(ioComposite, SWT.CHECK);
		chkBoxIOPrintRes.setText("Print results for failed iterations");
		chkBoxIOPrintRes.setBounds(346, 66, 192, 16);
		
		Group grpIOPrintCriterion = new Group(ioComposite, SWT.NONE);
		grpIOPrintCriterion.setText("Print Criterion");
		grpIOPrintCriterion.setBounds(10, 111, 323, 82);
		
		Button rdoIOPrintCriPrintEverySteps = new Button(grpIOPrintCriterion, SWT.RADIO);
		rdoIOPrintCriPrintEverySteps.setText("Print every");
		rdoIOPrintCriPrintEverySteps.setBounds(10, 22, 90, 16);
		
		Button rdoIOPrintCriPrintEveryS = new Button(grpIOPrintCriterion, SWT.RADIO);
		rdoIOPrintCriPrintEveryS.setText("Print every");
		rdoIOPrintCriPrintEveryS.setBounds(10, 54, 90, 16);
		
		txtIOPrintCriPrintEverySteps = new Text(grpIOPrintCriterion, SWT.BORDER);
		txtIOPrintCriPrintEverySteps.setBounds(106, 20, 150, 20);
		
		txtIOPrintCriPrintEveryS = new Text(grpIOPrintCriterion, SWT.BORDER);
		txtIOPrintCriPrintEveryS.setBounds(106, 52, 150, 20);
		
		Label label_20 = new Label(grpIOPrintCriterion, SWT.NONE);
		label_20.setText("steps");
		label_20.setBounds(262, 23, 41, 15);
		
		Label label_21 = new Label(grpIOPrintCriterion, SWT.NONE);
		label_21.setText("s");
		label_21.setBounds(262, 57, 17, 15);
		
		Label label_22 = new Label(ioComposite, SWT.NONE);
		label_22.setText("Base name of dumpfile :");
		label_22.setBounds(10, 202, 134, 15);
		
		txtIOBaseName = new Text(ioComposite, SWT.BORDER);
		txtIOBaseName.setBounds(150, 199, 183, 20);
		
		Label label_23 = new Label(ioComposite, SWT.WRAP);
		label_23.setText("Number of steps between dumpfile generation :");
		label_23.setBounds(10, 238, 161, 31);
		
		txtIONumSteps = new Text(ioComposite, SWT.BORDER);
		txtIONumSteps.setBounds(150, 235, 183, 20);

		Composite lumpsComposite = new Composite(tabFolder, SWT.NONE);
		tabItemLumpsPaths.setControl(lumpsComposite);
		
		Button btnLumpAddPrintedLump = new Button(lumpsComposite, SWT.NONE);
		btnLumpAddPrintedLump.setBounds(31, 38, 201, 43);
		btnLumpAddPrintedLump.setText("Add Printed Lumps");
		
		Button btnLumpAddPrintedPath = new Button(lumpsComposite, SWT.NONE);
		btnLumpAddPrintedPath.setText("Add Printed Path");
		btnLumpAddPrintedPath.setBounds(316, 38, 201, 43);
		
		Group grpLumpsPrintedLumps = new Group(lumpsComposite, SWT.NONE);
		grpLumpsPrintedLumps.setText("Printed Lumps");
		grpLumpsPrintedLumps.setBounds(10, 87, 250, 206);
		
		txtLumpsPLPrintedLumps = new Text(grpLumpsPrintedLumps, SWT.BORDER);
		txtLumpsPLPrintedLumps.setBounds(10, 23, 230, 173);
		
		Group grpLumpsPrintedPaths = new Group(lumpsComposite, SWT.NONE);
		grpLumpsPrintedPaths.setText("Printed Paths");
		grpLumpsPrintedPaths.setBounds(282, 87, 250, 206);
		
		txtLumpsPLPrintedPaths = new Text(grpLumpsPrintedPaths, SWT.BORDER);
		txtLumpsPLPrintedPaths.setBounds(10, 23, 230, 173);

		Composite solutionComposite = new Composite(tabFolder, SWT.NONE);
		tabItemSolution.setControl(solutionComposite);
		
		Group grpSolnSolnMethod = new Group(solutionComposite, SWT.NONE);
		grpSolnSolnMethod.setText("Solution Method");
		grpSolnSolnMethod.setBounds(10, 10, 158, 111);
		
		Button rdoSolnSMImp = new Button(grpSolnSolnMethod, SWT.RADIO);
		rdoSolnSMImp.setBounds(10, 29, 90, 16);
		rdoSolnSMImp.setText("Implicit");
		
		Button rdoSolnSMExp = new Button(grpSolnSolnMethod, SWT.RADIO);
		rdoSolnSMExp.setBounds(10, 64, 90, 16);
		rdoSolnSMExp.setText("Explicit");
		
		Group grpSolnGlobalSoln = new Group(solutionComposite, SWT.NONE);
		grpSolnGlobalSoln.setText("Global Solution");
		grpSolnGlobalSoln.setBounds(188, 10, 355, 111);
		
		Label lblGlobalRelacsation = new Label(grpSolnGlobalSoln, SWT.NONE);
		lblGlobalRelacsation.setBounds(10, 19, 154, 15);
		lblGlobalRelacsation.setText("Global Relaxation Parameter");
		
		Label lblGlobalResolution = new Label(grpSolnGlobalSoln, SWT.NONE);
		lblGlobalResolution.setText("Global Solution tolerance");
		lblGlobalResolution.setBounds(10, 52, 154, 15);
		
		Label lblMaximumNumberOf = new Label(grpSolnGlobalSoln, SWT.NONE);
		lblMaximumNumberOf.setText("Maximum Number of global iterations");
		lblMaximumNumberOf.setBounds(10, 81, 205, 15);
		
		txtSolnGSGlobalRelPara = new Text(grpSolnGlobalSoln, SWT.BORDER);
		txtSolnGSGlobalRelPara.setBounds(221, 16, 75, 20);
		
		txtSolnGSGlobalSolnTol = new Text(grpSolnGlobalSoln, SWT.BORDER);
		txtSolnGSGlobalSolnTol.setBounds(221, 49, 75, 20);
		
		txtSolnGSMaxGlobIter = new Text(grpSolnGlobalSoln, SWT.BORDER);
		txtSolnGSMaxGlobIter.setBounds(221, 78, 75, 20);
		
		Group grpSolnFlowSoln = new Group(solutionComposite, SWT.NONE);
		grpSolnFlowSoln.setText("Flow Solution");
		grpSolnFlowSoln.setBounds(10, 126, 533, 162);
		
		txtSolnFSFlowRelPara = new Text(grpSolnFlowSoln, SWT.BORDER);
		txtSolnFSFlowRelPara.setBounds(164, 17, 76, 21);
		
		Label lblFlowRelaxationParameter = new Label(grpSolnFlowSoln, SWT.NONE);
		lblFlowRelaxationParameter.setText("Flow Relaxation Parameter");
		lblFlowRelaxationParameter.setBounds(10, 20, 154, 15);
		
		txtSolnFSFlowSolnTol = new Text(grpSolnFlowSoln, SWT.BORDER);
		txtSolnFSFlowSolnTol.setBounds(164, 56, 75, 20);
		
		Label lblFlowSolutionTolerance = new Label(grpSolnFlowSoln, SWT.NONE);
		lblFlowSolutionTolerance.setText("Flow Solution tolerance");
		lblFlowSolutionTolerance.setBounds(10, 59, 154, 15);
		
		txtSolnFSMaxNumFlowIter = new Text(grpSolnFlowSoln, SWT.BORDER);
		txtSolnFSMaxNumFlowIter.setBounds(164, 102, 75, 20);
		
		Label lblMaximumNumberOf_1 = new Label(grpSolnFlowSoln, SWT.NONE);
		lblMaximumNumberOf_1.setAlignment(SWT.CENTER);
		lblMaximumNumberOf_1.setText("Maximum number of flow iterations");
		lblMaximumNumberOf_1.setBounds(10, 105, 145, 40);
		
		Label lblInitialFlowRate = new Label(grpSolnFlowSoln, SWT.NONE);
		lblInitialFlowRate.setText("Initial Flow Rate");
		lblInitialFlowRate.setBounds(246, 20, 137, 15);
		
		txtSolnFSInitFlowRate = new Text(grpSolnFlowSoln, SWT.BORDER);
		txtSolnFSInitFlowRate.setBounds(400, 17, 75, 20);
		
		Label lblZeroFloorFlow = new Label(grpSolnFlowSoln, SWT.NONE);
		lblZeroFloorFlow.setText("Zero floor flow value");
		lblZeroFloorFlow.setBounds(246, 59, 137, 15);
		
		txtSolnFSZeroFloorFlowVal = new Text(grpSolnFlowSoln, SWT.BORDER);
		txtSolnFSZeroFloorFlowVal.setBounds(400, 56, 75, 20);
		
		Label lblMinimumAllowableFlow = new Label(grpSolnFlowSoln, SWT.NONE);
		lblMinimumAllowableFlow.setAlignment(SWT.CENTER);
		lblMinimumAllowableFlow.setText("Minimum Allowable flow rate");
		lblMinimumAllowableFlow.setBounds(246, 105, 154, 40);
		
		txtSolnFSMinFlowRate = new Text(grpSolnFlowSoln, SWT.BORDER);
		txtSolnFSMinFlowRate.setBounds(400, 102, 75, 20);
		
		Label lblNewLabel = new Label(grpSolnFlowSoln, SWT.NONE);
		lblNewLabel.setBounds(482, 17, 41, 21);
		lblNewLabel.setText("m^3/s");
		
		Label label = new Label(grpSolnFlowSoln, SWT.NONE);
		label.setText("m^3/s");
		label.setBounds(482, 56, 41, 21);
		
		Label label_1 = new Label(grpSolnFlowSoln, SWT.NONE);
		label_1.setText("m^3/s");
		label_1.setBounds(482, 102, 41, 21);

		Composite constantsComposite = new Composite(tabFolder, SWT.NONE);
		tabItemConstants.setControl(constantsComposite);
		
		Group grpConstWaterProperties = new Group(constantsComposite, SWT.NONE);
		grpConstWaterProperties.setText("Water Properties");
		grpConstWaterProperties.setBounds(10, 10, 267, 149);
		
		Label lblSpecific = new Label(grpConstWaterProperties, SWT.NONE);
		lblSpecific.setBounds(10, 24, 93, 15);
		lblSpecific.setText("Specific Heat :");
		
		Label lblDensity = new Label(grpConstWaterProperties, SWT.NONE);
		lblDensity.setText("Density :");
		lblDensity.setBounds(10, 56, 93, 15);
		
		Label lblEnthal = new Label(grpConstWaterProperties, SWT.NONE);
		lblEnthal.setAlignment(SWT.CENTER);
		lblEnthal.setText("Enthalpy of formation of water vapour at 0 C:");
		lblEnthal.setBounds(10, 87, 107, 62);
		
		txtConstWPSpecHeat = new Text(grpConstWaterProperties, SWT.BORDER);
		txtConstWPSpecHeat.setBounds(123, 24, 75, 20);
		
		txtConstWPDensity = new Text(grpConstWaterProperties, SWT.BORDER);
		txtConstWPDensity.setBounds(123, 53, 75, 20);
		
		txtConstWPEnthWatVap = new Text(grpConstWaterProperties, SWT.BORDER);
		txtConstWPEnthWatVap.setBounds(123, 87, 75, 20);
		
		Label lblJ = new Label(grpConstWaterProperties, SWT.NONE);
		lblJ.setText("J/(kg-K)");
		lblJ.setBounds(205, 24, 52, 15);
		
		Label lblKg = new Label(grpConstWaterProperties, SWT.NONE);
		lblKg.setText("kg/m^3");
		lblKg.setBounds(204, 56, 52, 15);
		
		Label lblKgm = new Label(grpConstWaterProperties, SWT.NONE);
		lblKgm.setText("kg/m^3");
		lblKgm.setBounds(204, 87, 52, 15);
		
		Group grpConstAirProperties = new Group(constantsComposite, SWT.NONE);
		grpConstAirProperties.setText("Air Properties");
		grpConstAirProperties.setBounds(283, 10, 267, 149);
		
		Label label_2 = new Label(grpConstAirProperties, SWT.NONE);
		label_2.setText("Specific Heat :");
		label_2.setBounds(10, 24, 93, 15);
		
		Label label_3 = new Label(grpConstAirProperties, SWT.NONE);
		label_3.setText("Density :");
		label_3.setBounds(10, 55, 93, 15);
		
		txtConstAPSpecHeat = new Text(grpConstAirProperties, SWT.BORDER);
		txtConstAPSpecHeat.setBounds(122, 24, 75, 20);
		
		txtConstAPDensity = new Text(grpConstAirProperties, SWT.BORDER);
		txtConstAPDensity.setBounds(122, 53, 75, 20);
		
		txtConstAPEnthWatVap = new Text(grpConstAirProperties, SWT.BORDER);
		txtConstAPEnthWatVap.setBounds(122, 87, 75, 20);
		
		Label label_4 = new Label(grpConstAirProperties, SWT.NONE);
		label_4.setText("Enthalpy of formation of water vapour at 0 C:");
		label_4.setAlignment(SWT.CENTER);
		label_4.setBounds(10, 84, 107, 62);
		
		Label label_5 = new Label(grpConstAirProperties, SWT.NONE);
		label_5.setText("J/(kg-K)");
		label_5.setBounds(205, 24, 52, 15);
		
		Label label_6 = new Label(grpConstAirProperties, SWT.NONE);
		label_6.setText("kg/m^3");
		label_6.setBounds(204, 87, 52, 15);
		
		Label label_7 = new Label(grpConstAirProperties, SWT.NONE);
		label_7.setText("kg/m^3");
		label_7.setBounds(204, 56, 52, 15);
		
		Label lblGraviatationalAcceleration = new Label(constantsComposite, SWT.NONE);
		lblGraviatationalAcceleration.setText("Graviatational acceleration :\r\n");
		lblGraviatationalAcceleration.setAlignment(SWT.CENTER);
		lblGraviatationalAcceleration.setBounds(10, 173, 171, 26);
		
		text_2 = new Text(constantsComposite, SWT.BORDER);
		text_2.setBounds(187, 170, 75, 20);
		
		Label lblKgm_1 = new Label(constantsComposite, SWT.NONE);
		lblKgm_1.setText("m/s ^2");
		lblKgm_1.setBounds(283, 173, 52, 15);

		Composite fansComposite = new Composite(tabFolder, SWT.NONE);
		tabItemFansServers.setControl(fansComposite);
		
		Button btnFansAddServer = new Button(fansComposite, SWT.NONE);
		btnFansAddServer.setText("Add Server");
		btnFansAddServer.setBounds(316, 10, 201, 43);
		
		Group grpFansCreatedFans = new Group(fansComposite, SWT.NONE);
		grpFansCreatedFans.setText(" Created Fans");
		grpFansCreatedFans.setBounds(10, 59, 250, 206);
		
		txtFansCFCreatedFans = new Text(grpFansCreatedFans, SWT.BORDER);
		txtFansCFCreatedFans.setBounds(10, 23, 230, 173);
		
		Group grpFansCreatedServers = new Group(fansComposite, SWT.NONE);
		grpFansCreatedServers.setText("Created Servers");
		grpFansCreatedServers.setBounds(282, 59, 250, 206);
		
		txtFansCSCreatedServers = new Text(grpFansCreatedServers, SWT.BORDER);
		txtFansCSCreatedServers.setBounds(10, 23, 230, 173);
		
		Button btnFansAddFan = new Button(fansComposite, SWT.NONE);
		btnFansAddFan.setBounds(34, 10, 201, 43);
		btnFansAddFan.setText("Add Fan");

		Composite dataCenterComposite = new Composite(tabFolder, SWT.NONE);
		tabItemDataCenter.setControl(dataCenterComposite);
		
		Group grpDatacentermodel = new Group(dataCenterComposite, SWT.NONE);
		grpDatacentermodel.setText("DataCenterModel");
		grpDatacentermodel.setBounds(10, 10, 158, 71);
		
		Button btnDataCenterDCMGen1 = new Button(grpDatacentermodel, SWT.RADIO);
		btnDataCenterDCMGen1.setText("Generation 1");
		btnDataCenterDCMGen1.setBounds(10, 22, 90, 16);
		
		Button btnDataCenterDCMGen2 = new Button(grpDatacentermodel, SWT.RADIO);
		btnDataCenterDCMGen2.setText("Generation 2");
		btnDataCenterDCMGen2.setBounds(10, 44, 90, 16);
		
		Group group = new Group(dataCenterComposite, SWT.NONE);
		group.setText("Air Properties");
		group.setBounds(196, 10, 347, 71);
		
		Label lblTtotalHeatrGain = new Label(group, SWT.NONE);
		lblTtotalHeatrGain.setText("Total heat gain :");
		lblTtotalHeatrGain.setBounds(10, 24, 93, 15);
		
		txtDataCenterAPTotalHeatGain = new Text(group, SWT.BORDER);
		txtDataCenterAPTotalHeatGain.setBounds(122, 24, 75, 20);
		
		Label lblW = new Label(group, SWT.NONE);
		lblW.setText("W");
		lblW.setBounds(205, 24, 11, 15);
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setBounds(240, 24, 75, 25);
		btnNewButton.setText("Timecurve");
		
		Group grpDataCenterDimentsion = new Group(dataCenterComposite, SWT.NONE);
		grpDataCenterDimentsion.setText("Data Center Dimensions ");
		grpDataCenterDimentsion.setBounds(303, 87, 240, 199);
		
		Label lblXdimensions = new Label(grpDataCenterDimentsion, SWT.NONE);
		lblXdimensions.setText("x-dimension :");
		lblXdimensions.setBounds(10, 19, 82, 15);
		
		txtDataCenterDCDXDim = new Text(grpDataCenterDimentsion, SWT.BORDER);
		txtDataCenterDCDXDim.setBounds(148, 14, 50, 20);
		
		Label lblM = new Label(grpDataCenterDimentsion, SWT.NONE);
		lblM.setText("m");
		lblM.setBounds(204, 19, 23, 15);
		
		Label lblYdimensions = new Label(grpDataCenterDimentsion, SWT.NONE);
		lblYdimensions.setText("y-dimension :");
		lblYdimensions.setBounds(10, 53, 82, 15);
		
		txtDataCenterDCDYDim = new Text(grpDataCenterDimentsion, SWT.BORDER);
		txtDataCenterDCDYDim.setBounds(148, 48, 50, 20);
		
		Label label_9 = new Label(grpDataCenterDimentsion, SWT.NONE);
		label_9.setText("m");
		label_9.setBounds(204, 53, 23, 15);
		
		Label lblZdimensions = new Label(grpDataCenterDimentsion, SWT.NONE);
		lblZdimensions.setText("z-dimension  :");
		lblZdimensions.setBounds(10, 86, 82, 15);
		
		txtDataCenterDCDZDim = new Text(grpDataCenterDimentsion, SWT.BORDER);
		txtDataCenterDCDZDim.setBounds(148, 81, 50, 20);
		
		Label label_11 = new Label(grpDataCenterDimentsion, SWT.NONE);
		label_11.setText("m");
		label_11.setBounds(204, 86, 23, 15);
		
		Label lblS = new Label(grpDataCenterDimentsion, SWT.NONE);
		lblS.setText("Subfloor plenum height :");
		lblS.setBounds(10, 122, 132, 15);
		
		txtDataCenterDCDSubPlenHeight = new Text(grpDataCenterDimentsion, SWT.BORDER);
		txtDataCenterDCDSubPlenHeight.setBounds(149, 122, 50, 20);
		
		Label label_10 = new Label(grpDataCenterDimentsion, SWT.NONE);
		label_10.setText("m");
		label_10.setBounds(204, 122, 23, 15);
		
		Label lblReturnPlenumHeight = new Label(grpDataCenterDimentsion, SWT.NONE);
		lblReturnPlenumHeight.setText("Return plenum height :");
		lblReturnPlenumHeight.setBounds(10, 157, 132, 15);
		
		txtDataCenterDCDRetPlenHeight = new Text(grpDataCenterDimentsion, SWT.BORDER);
		txtDataCenterDCDRetPlenHeight.setBounds(149, 157, 50, 20);
		
		Label label_12 = new Label(grpDataCenterDimentsion, SWT.NONE);
		label_12.setText("m");
		label_12.setBounds(204, 157, 23, 15);
		
		Group grpGenerationParameters = new Group(dataCenterComposite, SWT.NONE);
		grpGenerationParameters.setText("Generation 2 Parameters");
		grpGenerationParameters.setBounds(10, 87, 287, 199);
		
		Label lblExternalHeatGain = new Label(grpGenerationParameters, SWT.NONE);
		lblExternalHeatGain.setText("External heat gain :");
		lblExternalHeatGain.setBounds(10, 24, 106, 15);
		
		txtDataCenterGPExtHeatGain = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPExtHeatGain.setBounds(122, 24, 42, 20);
		
		Label label_13 = new Label(grpGenerationParameters, SWT.NONE);
		label_13.setText("W");
		label_13.setBounds(170, 24, 19, 15);
		
		Button button = new Button(grpGenerationParameters, SWT.NONE);
		button.setText("Timecurve");
		button.setBounds(195, 19, 75, 25);
		
		Label lblNumberOfRackes = new Label(grpGenerationParameters, SWT.NONE);
		lblNumberOfRackes.setText("Number of racks :");
		lblNumberOfRackes.setBounds(10, 65, 106, 15);
		
		txtDataCenterGPNoRacks = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPNoRacks.setBounds(122, 65, 42, 20);
		
		Label label_14 = new Label(grpGenerationParameters, SWT.NONE);
		label_14.setText("W");
		label_14.setBounds(170, 65, 19, 15);
		
		Button btnLayout = new Button(grpGenerationParameters, SWT.NONE);
		btnLayout.setText("Layout");
		btnLayout.setBounds(195, 60, 75, 25);
		
		Label lblR = new Label(grpGenerationParameters, SWT.NONE);
		lblR.setText(" R (external equip):");
		lblR.setBounds(10, 96, 112, 15);
		
		txtDataCenterGPR = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPR.setBounds(148, 91, 58, 20);
		
		Label lblKw = new Label(grpGenerationParameters, SWT.NONE);
		lblKw.setText("K/W");
		lblKw.setBounds(235, 96, 42, 15);
		
		txtDataCenterGPFloorLeak = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPFloorLeak.setBounds(80, 130, 58, 20);
		
		Label lblFloorLeak = new Label(grpGenerationParameters, SWT.NONE);
		lblFloorLeak.setText("Floor Leak :");
		lblFloorLeak.setBounds(10, 133, 64, 15);
		
		Label lblCeilingLeak = new Label(grpGenerationParameters, SWT.NONE);
		lblCeilingLeak.setText("Ceiling  Leak :");
		lblCeilingLeak.setBounds(142, 133, 75, 15);
		
		txtDataCenterGPCeilLeak = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPCeilLeak.setBounds(223, 130, 58, 20);
		
		Label lblFloorOpen = new Label(grpGenerationParameters, SWT.NONE);
		lblFloorOpen.setText("Floor Open:");
		lblFloorOpen.setBounds(10, 172, 64, 15);
		
		txtDataCenterGPFloorOpen = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPFloorOpen.setBounds(80, 169, 58, 20);
		
		Label lblCeilingOpen = new Label(grpGenerationParameters, SWT.NONE);
		lblCeilingOpen.setText("Ceiling  Open :");
		lblCeilingOpen.setBounds(142, 172, 78, 15);
		
		txtDataCenterGPCeilOpen = new Text(grpGenerationParameters, SWT.BORDER);
		txtDataCenterGPCeilOpen.setBounds(223, 169, 58, 20);

		Group grpRunSimulationType = new Group(runComposite, SWT.NONE);
		grpRunSimulationType.setText("Simulation Type");
		grpRunSimulationType.setBounds(22, 25, 117, 98);

		Button rbtnRunSimTypeSteady = new Button(grpRunSimulationType, SWT.RADIO);
		rbtnRunSimTypeSteady.setBounds(10, 27, 90, 16);
		rbtnRunSimTypeSteady.setText("Steady");

		Button rbtnRunSimTypeTransient = new Button(grpRunSimulationType, SWT.RADIO);
		rbtnRunSimTypeTransient.setBounds(10, 49, 90, 16);
		rbtnRunSimTypeTransient.setText("Transient");

		Group grpRunTransientParam = new Group(runComposite, SWT.NONE);
		grpRunTransientParam.setText("Transient Parameter");
		grpRunTransientParam.setBounds(187, 25, 345, 189);

		Button rbtnRunTransParaFinalStep = new Button(grpRunTransientParam, SWT.RADIO);
		rbtnRunTransParaFinalStep.setBounds(10, 26, 90, 16);
		rbtnRunTransParaFinalStep.setText("Final Step");

		txtRunTransParaFinalStep = new Text(grpRunTransientParam, SWT.BORDER);
		txtRunTransParaFinalStep.setBounds(127, 21, 181, 21);

		Button rbtnRunTransParaFinalTime = new Button(grpRunTransientParam, SWT.RADIO);
		rbtnRunTransParaFinalTime.setBounds(10, 55, 90, 16);
		rbtnRunTransParaFinalTime.setText("Final Time");

		txtRunTransParaFinalTime = new Text(grpRunTransientParam, SWT.BORDER);
		txtRunTransParaFinalTime.setBounds(127, 48, 181, 21);

		Label restartTimeStepValue = new Label(grpRunTransientParam, SWT.NONE);
		restartTimeStepValue.setBounds(34, 106, 98, 15);
		restartTimeStepValue.setText("Time Step Value :");

		Label restartFileLabel = new Label(grpRunTransientParam, SWT.NONE);
		restartFileLabel.setBounds(34, 139, 98, 15);
		restartFileLabel.setText("Restart File Name :");

		txtRunTransParaTimeStepVal = new Text(grpRunTransientParam, SWT.BORDER);
		txtRunTransParaTimeStepVal.setBounds(151, 103, 168, 21);

		txtRunTransRestartFileName = new Text(grpRunTransientParam, SWT.BORDER);
		txtRunTransRestartFileName.setBounds(151, 136, 168, 21);

		Button overriteCheckButton = new Button(runComposite, SWT.CHECK);
		overriteCheckButton.setBounds(25, 229, 467, 16);
		overriteCheckButton
				.setText("Overrite Component Parameters with design Values");
		
		Composite externalComposite = new Composite(tabFolder, SWT.NONE);
		tabItemExternal.setControl(externalComposite);
		
		Label lblExternal = new Label(externalComposite, SWT.NONE);
		lblExternal.setText("External air dry-bulb temperature:");
		lblExternal.setBounds(53, 32, 203, 15);
		
		txtExtExtAirBulbTemp = new Text(externalComposite, SWT.BORDER);
		txtExtExtAirBulbTemp.setBounds(281, 29, 75, 20);
		
		Label lblC = new Label(externalComposite, SWT.NONE);
		lblC.setText("C");
		lblC.setBounds(362, 27, 11, 15);
		
		Button btnExtTimeCurve = new Button(externalComposite, SWT.NONE);
		btnExtTimeCurve.setText("Timecurve");
		btnExtTimeCurve.setBounds(396, 27, 75, 25);
		
		Group grpExternalAir = new Group(externalComposite, SWT.NONE);
		grpExternalAir.setText("External Air Humidity");
		grpExternalAir.setBounds(41, 91, 363, 140);
		
		Button btnRelativeHumidity = new Button(grpExternalAir, SWT.RADIO);
		btnRelativeHumidity.setText("Relative Humidity :");
		btnRelativeHumidity.setBounds(10, 30, 136, 16);
		
		Button btnDuePoint = new Button(grpExternalAir, SWT.RADIO);
		btnDuePoint.setText("Due point :");
		btnDuePoint.setBounds(10, 64, 90, 16);
		
		Button btnWetBulb = new Button(grpExternalAir, SWT.RADIO);
		btnWetBulb.setText("Wet bulb :");
		btnWetBulb.setBounds(10, 98, 90, 16);
		
		txtExtEAHRelHum = new Text(grpExternalAir, SWT.BORDER);
		txtExtEAHRelHum.setBounds(152, 28, 75, 20);
		
		Label label_8 = new Label(grpExternalAir, SWT.NONE);
		label_8.setText("%");
		label_8.setBounds(251, 31, 17, 20);
		
		txtExtEAHDuePoint = new Text(grpExternalAir, SWT.BORDER);
		txtExtEAHDuePoint.setBounds(152, 62, 75, 20);
		
		Label label_15 = new Label(grpExternalAir, SWT.NONE);
		label_15.setText("C");
		label_15.setBounds(251, 65, 17, 20);
		
		txtExtEAHWetBulb = new Text(grpExternalAir, SWT.BORDER);
		txtExtEAHWetBulb.setBounds(152, 96, 75, 20);
		
		Label label_16 = new Label(grpExternalAir, SWT.NONE);
		label_16.setText("C");
		label_16.setBounds(251, 99, 17, 20);
		
		Label lblExternalWaterTemperature = new Label(externalComposite, SWT.NONE);
		lblExternalWaterTemperature.setText("External water temperature :");
		lblExternalWaterTemperature.setBounds(53, 251, 203, 15);
		
		txtExtEAHExtWatTemp = new Text(externalComposite, SWT.BORDER);
		txtExtEAHExtWatTemp.setBounds(281, 248, 75, 20);
		
		Label label_18 = new Label(externalComposite, SWT.NONE);
		label_18.setText("C");
		label_18.setBounds(362, 246, 11, 15);

		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setText("Cancel ");
		button_2.setBounds(0, 334, 114, 38);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setText("Save");
		button_3.setBounds(444, 333, 115, 38);

	}
}
