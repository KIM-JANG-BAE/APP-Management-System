package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import app.AppInput;
import manager.AppManager;

public class AppViewer extends JPanel{
	
	WindowFrame frame; 
	
	AppManager appmanager;

	public AppViewer(WindowFrame frame, AppManager appmanager){
		
		this.frame = frame;
		this.appmanager = appmanager;
		
		System.out.println("***" + appmanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Code");
		model.addColumn("Name");
		model.addColumn("Capacity");
		
		for(int i = 0; i < appmanager.size(); i++) {
			Vector row = new Vector();
			AppInput ai = appmanager.get(i);
			row.add(ai.getCode());
			row.add(ai.getName());
			row.add(ai.getCapacity());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
		
	}

}
