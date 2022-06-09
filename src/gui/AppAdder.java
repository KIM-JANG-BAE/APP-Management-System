package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.AppAddCancelListener;
import listener.AppAdderListener;
import manager.AppManager;

public class AppAdder extends JPanel {
	
	WindowFrame frame;
	
	AppManager appmanager;
	
	public AppAdder(WindowFrame frame, AppManager appmanager) {
		
		this.frame = frame;
		this.appmanager = appmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelCode = new JLabel("Code: ", JLabel.TRAILING);
		JTextField fieldCode = new JTextField(10);
		labelCode.setLabelFor(fieldCode);
		panel.add(labelCode);
		panel.add(fieldCode);
		 
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelCapacity = new JLabel("Capacity: ", JLabel.TRAILING);
		JTextField fieldCapacity = new JTextField(10);
		labelCapacity.setLabelFor(fieldCapacity);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AppAdderListener(fieldCode, fieldName, fieldCapacity, appmanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AppAddCancelListener(frame));
		
		panel.add(labelCapacity);
		panel.add(fieldCapacity);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
