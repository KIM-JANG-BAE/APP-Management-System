package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AppAdder extends JFrame {
	public AppAdder() {
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
		panel.add(labelCapacity);
		panel.add(fieldCapacity);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
