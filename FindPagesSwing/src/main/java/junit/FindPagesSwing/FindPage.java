package junit.FindPagesSwing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FindPage extends JFrame implements ActionListener
	{ 
		JTextField txtPage, txtFindPage;
		JButton btnFind;
		
		public FindPage() {
			JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(2,2,15,15));
			p1.add(new JLabel("Paper : ", SwingConstants.LEFT));
			p1.add(txtPage = new JTextField(12));
			p1.add(new JLabel("Pick a page : ", SwingConstants.LEFT));
			p1.add(txtPage = new JTextField(12));
			
			JPanel p2 = new JPanel();
			p2.setLayout(new BorderLayout(30,30));
			p2.add(new JLabel("Find page Number", SwingConstants.CENTER), BorderLayout.NORTH);
			p2.add(p1, BorderLayout.CENTER);
			
			JPanel p3 = new JPanel();
			p3.setLayout(new FlowLayout());
			p3.add(btnFind = new JButton("Find"));
			

			JPanel p4 = new JPanel();
			p4.setLayout(new BorderLayout(10, 10));
			p4.add(p3, BorderLayout.NORTH);
			
			JTextArea area = new JTextArea();
			JPanel p5 = new JPanel();
			p5.setLayout(new BorderLayout(10,10));
			p5.add(p2, BorderLayout.NORTH);
			p5.add(p4, BorderLayout.CENTER);
			
			JPanel p = new JPanel();
            p.setLayout(new BorderLayout(10,10));
			p.add(p5, BorderLayout.NORTH);
			p.add(area, BorderLayout.CENTER);
			JPanel pp = new JPanel();
			pp.setLayout(new CardLayout(40,20));
			pp.add(p);
			add(pp);
			setSize(350, 400);
			setVisible(true);
		}
		
	    public static void main( String[] args )
	    {
	       new FindPage();	
	    }

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
