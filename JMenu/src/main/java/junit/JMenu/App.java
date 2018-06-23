package junit.JMenu;
import java.awt.event.*;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App implements ActionListener
{
	JFrame f;
	JMenuBar menuBar;
	JMenu file, edit, help;
	JMenuItem cut, copy, paste, selectAll;
	JTextArea area;
	
	public App() {
		f = new JFrame();
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		selectAll = new JMenuItem("Select All");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		menuBar = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		area = new JTextArea();
		
		area.setBounds(5,5,360,320);
		f.add(menuBar);
		f.add(area);
		f.setJMenuBar(menuBar);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
		
	}
    public static void main( String[] args )
    {
        new App();
    }

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == cut) {
			area.cut();
		}
		if(e.getSource() == copy) {
			area.copy();
		}
		if(e.getSource() == paste) {
			area.paste();
		}
		if(e.getSource() == selectAll) {
			area.selectAll();
		}
	}
}
