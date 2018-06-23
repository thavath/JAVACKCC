package ButtonEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class ButtonEvent {
	
	private JFrame mainFrame;
	private JLabel statusLabel;
	private JLabel headerLabel;
	private JPanel controlPanel;
	
	public ButtonEvent() {
		mainFrame = new JFrame("Java Swing Example");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("Please click the Button..", JLabel.CENTER);
		statusLabel.setSize(350, 100);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			@SuppressWarnings("unused")
			public void WindowClosing( WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	
	private void showEventDemo() {
		headerLabel.setForeground(Color.WHITE);
		statusLabel.setForeground(Color.WHITE);
		headerLabel.setText("Control in action: Button.");
		
		JButton okButton = new JButton("OK");
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");
		
		okButton.setActionCommand("OK");
		submitButton.setActionCommand("Submit");
		cancelButton.setActionCommand("Cancel");
		
		okButton.addActionListener(new ButtonClickListener());
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());
		controlPanel.setBackground(Color.red);  
		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);
//		mainFrame.setBackground(Color.blue);
		mainFrame.getContentPane().setBackground(Color.blue); 
		mainFrame.setVisible(true);
		
	}
	public static void main(String[] args) {
		ButtonEvent buttonEvent = new ButtonEvent();
		buttonEvent.showEventDemo();
	}
	private class ButtonClickListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			if(command.equals("OK")) {
				statusLabel.setText("OK Button clicked...");
			}else if(command.equals("Submit")) {
				statusLabel.setText("Submit Button clicked...");
			}else {
				statusLabel.setText("Cancel Button clicked...");
			}
		}

	}
}



