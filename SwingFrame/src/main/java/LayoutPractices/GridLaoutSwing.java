package LayoutPractices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GridLaoutSwing extends JFrame{
	JTextField tfn, tfr;
	JButton bti, bte;
	
	public GridLaoutSwing () {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 2,10,10));
		p.add(new JLabel("Name"));
		tfn = new JTextField(12);
		p.add(tfn);
		p.add(bti = new JButton("Insert"));
		p.add(bte = new JButton("Exit"));
		p.add(new JLabel("Result"));
		p.add(tfr = new JTextField(12));
		add(p);
		bti.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfr.setText(tfn.getText());
			}
		});
		bte.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLaoutSwing();
	}
}
