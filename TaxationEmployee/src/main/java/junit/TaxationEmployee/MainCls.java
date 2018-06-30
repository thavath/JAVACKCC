package junit.TaxationEmployee;

import java.awt.*;
import java.awt.event.*;
//import java.sql.Time;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class MainCls extends JFrame implements ActionListener{

	// For main menu
	JMenuBar menuBar;
	JMenu mFile, mEmployee, mReport, mTax, mHelp;
	// For menu file
	JMenuItem mItemNew, mItemSave, mItemExit;
	// For menu Employee
	JMenuItem mItemNewEmp, mItemListEmp;
	// For menu Report
	JMenuItem mItemTaxReport;
	// For menu Tax
	JMenuItem mItemTaxRule, mItemTaxCalculator;
	// For menu help
	JMenuItem mItemWelcome, mItemHelpContents, mItemCheckUpdate, mItemAbout;
	// For Tree Employee
	JTree jTreeEmployee, jTreeReport, jTreeTaxRule;
	// For right tab
	JTabbedPane jTab;
	// For create new Employee
	JComboBox cboGender;
	JTextField txtEmpID, txtFirstName, txtLastName, txtEmail, txtDOB;
	// For company 
	
	JTextField txtSalary, txtBenefit, txtDepartment, txtPosition;
	// For Family
	
	JTextField txtmMinorChild;
	JRadioButton rbYes, rbNo;
	
	// New Employee Button
	JButton btnSave, btnClear;
	
	// Search Box
	JComboBox cboFeilds;
	JTextField txtSearch;
	DefaultTableModel tbModel;
	JTable tbEmp;
	
	public MainCls() {
	
		// Create Object menuItem of file
		mItemNew = new JMenuItem("New");
		mItemSave = new JMenuItem("Save");
		mItemExit = new JMenuItem("Exit");
		// Create object bar and its items
		mFile = new JMenu("File");
		mFile.add(mItemNew);
		mFile.add(mItemSave);
		// line ---------
		mFile.add(new JSeparator());
		mFile.add(mItemExit);
		//=============== End Menu File ====================
		// Create Object Menu Item of Employee
		mItemNewEmp = new JMenuItem("New Employee");
		mItemNewEmp.addActionListener(this);
		mItemListEmp = new JMenuItem("List Employee");
		mItemListEmp.addActionListener(this);
		// Create Object Menu Employee and add its items	
		mEmployee = new JMenu("Employees");
		mEmployee.add(mItemNewEmp);
		mEmployee.add(mItemListEmp);
		//=============== End Menu Employee =================
		// Create Object menu Item of Report
		mItemTaxReport = new JMenuItem("Employee Tax Report");
		mItemTaxReport.addActionListener(this);
		// Create Object menu Report add its items
		mReport = new JMenu("Report");
		mReport.add(mItemTaxReport);
		//=============== End of Menu Report ================
		// Create Object menu item of Tax rule
		mItemTaxRule = new JMenuItem("Tax Rule 2018");
		mItemTaxRule.addActionListener(this);
		mItemTaxCalculator = new JMenuItem("Tax Calculator");
		mItemTaxCalculator.addActionListener(this);
		//Create Object  menu tax rule and add its items
		mTax = new JMenu("Tax Rule");
		mTax.add(mItemTaxRule);
		mTax.add(mItemTaxCalculator);
		// ============= End of Menu Report =================
		// Create Object Menu Item of Help
		mItemWelcome = new JMenuItem("Welcome");
		mItemHelpContents = new JMenuItem("Help Contents");
		mItemCheckUpdate = new JMenuItem("Check Update");
		mItemAbout = new JMenuItem("About Employee");
		// Create Object menu Help add its items
		mHelp = new JMenu("Help");
		mHelp.add(mItemWelcome);
		mHelp.add(mItemHelpContents);
		mHelp.add(new JSeparator());
		mHelp.add(mItemCheckUpdate);
		mHelp.add(mItemAbout);	
		// ============= End of Menu Help ===================

		// Create object bar and its menus
		menuBar = new JMenuBar();
		menuBar.add(mFile);
		menuBar.add(mEmployee);
		menuBar.add(mReport);
		menuBar.add(mTax);
		menuBar.add(mHelp);
		// ============ End of Menu Bar =====================
		// Create JSpliPane Object
		JTree leftJTree = new JTree();
		// Add JTree into left Panel
		leftJTree = createJTree();
		jTab = new JTabbedPane();
		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,leftJTree, jTab);
		// Add Menu bar to Frame
		jsp.setDividerLocation(200);
		add(menuBar);
		add(jsp);
		setTitle("Tax Program Version 1.0");
		setJMenuBar(menuBar);
		// setSize(500,500);
		// setSize to full screen
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		
	}
	
	private JTree createJTree() {
		// TODO Auto-generated method stub
		//Create Tree Node Employee 
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root Node");
		DefaultMutableTreeNode nodeEmpMgt = new DefaultMutableTreeNode("Employee");
		DefaultMutableTreeNode nodeAddEmp = new DefaultMutableTreeNode("New Employee");
		DefaultMutableTreeNode nodeListEmp = new DefaultMutableTreeNode("List Employee");
		nodeEmpMgt.add(nodeAddEmp); 
		nodeEmpMgt.add(nodeListEmp);
		// Create JTree Employee
		// ============End of Tree Employee
		// create object Tree node Tax report
		DefaultMutableTreeNode nodeReport = new DefaultMutableTreeNode("Report");
		DefaultMutableTreeNode nodeReportTax = new DefaultMutableTreeNode("Employee Tax Report");
		nodeReport.add(nodeReportTax);
		// Create JTree Report
		DefaultMutableTreeNode nodeTaxRule = new DefaultMutableTreeNode("Tax Rule");
		DefaultMutableTreeNode nodeTaxRule2018 = new DefaultMutableTreeNode("Tax Rule 2018");
		DefaultMutableTreeNode nodeTaxCaculator = new DefaultMutableTreeNode("Tax Calculator");
		nodeTaxRule.add(nodeTaxRule2018);
		nodeTaxRule.add(nodeTaxCaculator);
		// Add all node to the same root
		rootNode.add(nodeEmpMgt);
		rootNode.add(nodeReport);
		rootNode.add(nodeTaxRule);
		// Create new Root to add all node to Panel
		final JTree nodeRoot = new JTree(rootNode);
		nodeRoot.setRootVisible(false);
		nodeRoot.setRowHeight(25);
		// set padding of tree
		nodeRoot.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		nodeRoot.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				//Find selected node of tree
				int selectedRow = nodeRoot.getRowForLocation(e.getX(), e.getY());
				// Condition when mouse pressed on a specific node
				if(selectedRow != -1) {
					// 	When mouse pressed is double clicked
					if(e.getClickCount() == 2) {
						// Get for tree path
						TreePath treePath = nodeRoot.getPathForLocation(e.getX(), e.getY());
						// Get last selected path
						String lastSelectedPath = treePath.getLastPathComponent().toString();
						if(lastSelectedPath.equals("New Employee")) {
							listAndNewEmployee();
						}else if(lastSelectedPath.equals("List Employee")) {
							listAndNewEmployee();
						}else if(lastSelectedPath.equals("Employee Tax Report")) {
							employeeTaxReport();
						}else if(lastSelectedPath.equals("Tax Rule 2018")) {
							taxRule2018();
						}else if(lastSelectedPath.equals("Tax Calculator")) {
							taxCalculator();
						}
					}
				}
			}
		});
		// Expand all tree nodes
		for (int i = 0; i <= nodeRoot.getRowCount(); i++) {
			// getRowCount to count number of node in JTree
			// expandRow to show node in detail one by one
			nodeRoot.expandRow(i);
		}
		return nodeRoot;
	}
	
	// ActionListener of Tree and Menu data menber
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == mItemNewEmp) {
			listAndNewEmployee();
		} else if(e.getSource() == mItemListEmp) {
			listAndNewEmployee();
		}else if(e.getSource() == mItemTaxRule){
			//Create Icon
			taxRule2018();	
		}else if(e.getSource() == mItemTaxCalculator) {
			taxCalculator();
		}else if(e.getSource() == mItemTaxReport) {
			employeeTaxReport();
		}
		
	}

	private JPanel employeeSection() {
		// Create Block Employee Section
		JPanel blockEmpInfo = new JPanel(new GridLayout(6, 2, 10, 10));
		blockEmpInfo.add(new JLabel("Employee ID :"));
		blockEmpInfo.add(txtEmpID = new JTextField());
		blockEmpInfo.add(new JLabel("Employee First Name :"));
		blockEmpInfo.add(txtFirstName = new JTextField());
		blockEmpInfo.add(new JLabel("Employee Last Name :"));
		blockEmpInfo.add(txtLastName = new JTextField());
		blockEmpInfo.add(new JLabel("Employee Gender :"));
		String[] Gender = {"Male", "Female"};
		blockEmpInfo.add(cboGender = new JComboBox(Gender));

		blockEmpInfo.add(new JLabel("Employee Email :"));
		blockEmpInfo.add(txtEmail = new JTextField());
		blockEmpInfo.add(new JLabel("Employee Birthday (dd//mm/yyyy):"));
		blockEmpInfo.add(txtDOB = new JTextField());
		JPanel blockEmpInfo_FINAL = new JPanel(new BorderLayout(10, 10));
		blockEmpInfo_FINAL.add(new JLabel("Employee Information"), BorderLayout.NORTH);
		blockEmpInfo_FINAL.add(new JSeparator(), BorderLayout.CENTER);
		blockEmpInfo_FINAL.add(blockEmpInfo, BorderLayout.SOUTH);
		return 	blockEmpInfo_FINAL;
		
	}
	private JPanel companySection() {
		// Create Company block
		JPanel blockComInfo = new JPanel(new GridLayout(4, 2, 10, 10));
		blockComInfo.add(new JLabel("Employee Department :"));
		blockComInfo.add(txtDepartment = new JTextField());
		blockComInfo.add(new JLabel("Employee Position :"));
		blockComInfo.add(txtPosition= new JTextField());
		blockComInfo.add(new JLabel("Employee Salary($) :"));
		blockComInfo.add(txtSalary = new JTextField());
		blockComInfo.add(new JLabel("Employee Benefit($) :"));
		blockComInfo.add(txtBenefit = new JTextField());

		JPanel blockComInfo_FINAL = new JPanel(new BorderLayout(10, 10));
		blockComInfo_FINAL.add(new JLabel("Company Information"), BorderLayout.NORTH);
		blockComInfo_FINAL.add(new JSeparator(), BorderLayout.CENTER);
		blockComInfo_FINAL.add(blockComInfo, BorderLayout.SOUTH);
		return blockComInfo_FINAL;
	}
	private JPanel familySection() {
		// Create Block Family 
				JPanel blockFamInfo = new JPanel(new GridLayout(2, 2, 10, 10));
				blockFamInfo.add(new JLabel("Employee Has Spouse? :"));
				// Radio button FlowLaout
				JPanel rbPanel = new JPanel(new FlowLayout());
				rbPanel.add(rbYes = new JRadioButton("Yes"));
				rbPanel.add(rbNo = new JRadioButton("No"));
				ButtonGroup bgGroup = new ButtonGroup();
				bgGroup.add(rbYes);
				bgGroup.add(rbNo);
				//=================================================
				blockFamInfo.add(rbPanel);
				blockFamInfo.add(new JLabel("Employee Minor Child :"));
				blockFamInfo.add(txtmMinorChild = new JTextField(12));
				// Create block Family Info Final
				JPanel blockFamInfo_FINAL = new JPanel(new BorderLayout(10, 10));
				blockFamInfo_FINAL.add(new JLabel("Family Information"), BorderLayout.NORTH);
				blockFamInfo_FINAL.add(new JSeparator(), BorderLayout.CENTER);
				blockFamInfo_FINAL.add(blockFamInfo, BorderLayout.SOUTH);
			return blockFamInfo_FINAL;
	}
	// Block btn Employee
	private JPanel finalBlockNewEmployee() {
		JPanel empNew = new JPanel(new BorderLayout(10, 10));
		// Create group box - New Employee
		TitledBorder tBorderNewEmp = BorderFactory.createTitledBorder("Create Employee");
		tBorderNewEmp.setTitleJustification(TitledBorder.CENTER);
		empNew.setBorder(tBorderNewEmp);
		// Combine all in one
		JPanel blockAllInfo = new JPanel(new BorderLayout(10, 10));
		blockAllInfo.add(employeeSection(), BorderLayout.NORTH);
		blockAllInfo.add(companySection() , BorderLayout.CENTER);
		blockAllInfo.add(familySection(), BorderLayout.SOUTH);
		// Button section ==================================== 
		JPanel actionButton = new JPanel(new FlowLayout());
		actionButton.add(btnSave = new JButton("SAVE"));
		actionButton.add(btnClear = new JButton("CLEAR"));
		// ==================== Add all and Button Section
		JPanel blockAllInfo_Final = new JPanel(new BorderLayout(10,10));
		blockAllInfo_Final.add(blockAllInfo, BorderLayout.NORTH);
		blockAllInfo_Final.add(new JSeparator(), BorderLayout.CENTER);
		blockAllInfo_Final.add(actionButton, BorderLayout.SOUTH);
		empNew.add(blockAllInfo_Final);
		return empNew;
	}
	// =================================================================
	// Tab List and Create New Employee
	private JPanel finalBlockListEmployee() {
		
		JPanel empList = new JPanel(new BorderLayout(10, 10));
		TitledBorder tBorderNewEmp = BorderFactory.createTitledBorder("LIST OF EMPLOYEES");
		tBorderNewEmp.setTitleJustification(TitledBorder.CENTER);
		empList.setBorder(tBorderNewEmp);
		// Create Search box and Count Employee
		JPanel searchAndCountPanel = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel searchPanel = new JPanel(new FlowLayout());
		searchPanel.add(new JLabel("Fields :"));
		String[] searchFeildsText = {"ID", "First Name", "Last Name", "Email", "Department", "Position"};
		searchPanel.add(cboFeilds = new JComboBox(searchFeildsText));
		searchPanel.add(new JLabel("Search"));
		searchPanel.add(txtSearch = new JTextField(12));
		// Create Search Area
		searchAndCountPanel.add(searchPanel);
		// Add Count Employee
		searchAndCountPanel.add(new JLabel("# Employees : 0", SwingConstants.RIGHT));
		// Add header to Layout
		
		JPanel blockHearder = new JPanel(new BorderLayout(10, 10));
		blockHearder.add(new JLabel("List of Your Employees"), BorderLayout.NORTH);
		blockHearder.add(new JSeparator(), BorderLayout.CENTER);
		blockHearder.add(searchAndCountPanel, BorderLayout.SOUTH);
		// Finish Header Layout Section
		// ======================================================
		// Table Employee 
		tbModel = new DefaultTableModel();
		tbModel.addColumn("ID");
		tbModel.addColumn("First Name");
		tbModel.addColumn("Last Name");
		tbModel.addColumn("Gender");
		tbModel.addColumn("Email");
		tbModel.addColumn("Birthday");
		tbModel.addColumn("Department");
		tbModel.addColumn("Position");
		tbModel.addColumn("Salary($)");
		tbModel.addColumn("Benefit($)");
		tbModel.addColumn("Spouse");
		tbModel.addColumn("Minor Children");
		String data[] = {"105","Inhae","Park","Male","inhae.park@gmail.com","10/06/1996","Development","Software Engineer","2900","80", "N","0"};
		// ======================================================
		tbEmp = new JTable(tbModel);
		for (int i = 0; i < 100; i++) {
			tbModel.addRow(data);
		}
		
		JPanel blockFINAL = new JPanel(new BorderLayout(10, 10));
		blockFINAL.add(blockHearder, BorderLayout.NORTH);
		blockFINAL.add(new JScrollPane(tbEmp), BorderLayout.CENTER);
		empList.add(blockFINAL);
		return empList;
	}
	
	// Tab List and Create New Employee
	private void listAndNewEmployee() {
		JPanel empPanel = new JPanel(new BorderLayout(10, 10));
		// =======================================
		// Add New Employee Section to Layout
		empPanel.add(new JScrollPane(finalBlockNewEmployee()), BorderLayout.EAST);
		// Finished New Employee Section to Layout
		// =======================================
		// Add List Employee Section
		empPanel.add(new JScrollPane(finalBlockListEmployee()), BorderLayout.CENTER);
		// =======================================
		
		JPanel mainBlock = new JPanel(new CardLayout(10, 10));
		mainBlock.add(empPanel);
		// Tap Bar of Employee List and New Section
		jTab.addTab("Employee List", mainBlock);
		jTab.setSelectedComponent(mainBlock);
		
	}
	
	private void taxCalculator() {
		jTab.addTab("Tax Calculator", new JLabel("Tax Calculator..."));
	}
	private void employeeTaxReport() {
		// TODO Auto-generated method stub
		jTab.addTab("Tax Report Employee", new JLabel("Tax Report Employee..."));		
		
	}
	// Tax Rule 2018 Tab and Tree
	private void taxRule2018() {
		JLabel lbl1 = new JLabel("",SwingConstants.CENTER);
		ImageIcon icon1 = new ImageIcon("images/tax2018-1.jpg");
		lbl1.setIcon(icon1);
		JLabel lbl2 = new JLabel("",SwingConstants.CENTER);
		ImageIcon icon2 = new ImageIcon("images/tax2018-2.jpg");
		lbl2.setIcon(icon2);
		JLabel lbl3 = new JLabel("",SwingConstants.CENTER);
		ImageIcon icon3 = new ImageIcon("images/tax2018-3.jpg");
		lbl3.setIcon(icon3);
		// Create Panel for Icon
		JPanel jPanelIcon = new JPanel(new BorderLayout(10,10));
		jPanelIcon.add(lbl1, BorderLayout.NORTH);
		jPanelIcon.add(lbl2, BorderLayout.CENTER);
		jPanelIcon.add(lbl3, BorderLayout.SOUTH);
		// Add jTab and Scroll pane
		JScrollPane jspanel = new JScrollPane(jPanelIcon);
		jTab.addTab("Tax Rule 2018", jspanel);
		jTab.setSelectedComponent(jspanel);	
	}
	// Main Function To Execute Program
	public static void main(String[] args) {
		new MainCls();
	}
}
