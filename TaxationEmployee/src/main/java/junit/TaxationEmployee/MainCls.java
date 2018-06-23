package junit.TaxationEmployee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

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
		mItemListEmp = new JMenuItem("List Employee");
		// Create Object Menu Employee and add its items	
		mEmployee = new JMenu("Employees");
		mEmployee.add(mItemNewEmp);
		mEmployee.add(mItemListEmp);
		//=============== End Menu Employee =================
		// Create Object menu Item of Report
		mItemTaxReport = new JMenuItem("Employee Tax Report");
		// Create Object menu Report add its items
		mReport = new JMenu("Report");
		mReport.add(mItemTaxReport);
		//=============== End of Menu Report ================
		// Create Object menu item of Tax rule
		mItemTaxRule = new JMenuItem("Tax Rule 2018");
		mItemTaxCalculator = new JMenuItem("Tax Calculator");
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
		JPanel leftPanel = new JPanel();
		// Add JTree into left Panel
		leftPanel = createLeftPanelTree();
		JPanel rightPanel = new JPanel();
		rightPanel.add(new JLabel("Right"));
		
		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,leftPanel, rightPanel);
		// Add Menu bar to Frame
		add(menuBar);
		add(jsp);
		setTitle("Tax Program Version 1.0");
		setJMenuBar(menuBar);
		// setSize(500,500);
		// setSize to full screen
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		
	}
	
	private JPanel createLeftPanelTree() {
		// TODO Auto-generated method stub
		JPanel leftPanel = new JPanel();
		//Create Tree Node Employee 
		DefaultMutableTreeNode nodeEmpMgt = new DefaultMutableTreeNode("Employee");
		DefaultMutableTreeNode nodeAddEmp = new DefaultMutableTreeNode("Add Employee");
		DefaultMutableTreeNode nodeListEmp = new DefaultMutableTreeNode("List Employee");
		nodeEmpMgt.add(nodeAddEmp); nodeEmpMgt.add(nodeListEmp);
		// Create JTree Employee
		jTreeEmployee = new JTree(nodeEmpMgt);
		// ============End of Tree Employee
		// create object Tree node Tax report
		DefaultMutableTreeNode nodeReport = new DefaultMutableTreeNode("Report");
		DefaultMutableTreeNode nodeReportTax = new DefaultMutableTreeNode("Report Tax");
		nodeReport.add(nodeReportTax);
		// Create JTree Report
		jTreeReport = new JTree(nodeReport);
		leftPanel.add(jTreeEmployee);
		leftPanel.add(jTreeReport);
		return leftPanel;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new MainCls();
	}
	 
}
