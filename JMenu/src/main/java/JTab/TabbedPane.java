package JTab;

import javax.swing.*;

public class TabbedPane extends JFrame{
	public TabbedPane() {
		JTextArea area = new JTextArea(200,200);
		JPanel p1 = new JPanel();
		p1.add(area);
		
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JTabbedPane tab = new JTabbedPane();
		tab.setBounds(50, 50, 200, 200);
		tab.add("Main", p1);
		tab.addTab("Visit", p2);
		tab.add("Help", p3);
		
		add(tab);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TabbedPane();
	}
}
