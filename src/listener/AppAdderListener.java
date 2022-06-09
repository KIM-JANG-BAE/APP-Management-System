package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import app.AppInput;
import app.AppKind;
import app.Basicapp;
import manager.AppManager;

public class AppAdderListener implements ActionListener {
	
	JTextField fieldCode;
	JTextField fieldName;
	JTextField fieldCapacity;
	
	AppManager appmanager;
	
	public AppAdderListener(JTextField fieldCode, JTextField fieldName, JTextField fieldCapacity, AppManager appmanager) {
		this.fieldCapacity = fieldCapacity;
		this.fieldCode = fieldCode;
		this.fieldName = fieldName;
		this.appmanager = appmanager;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldCode.getText());
		System.out.println(fieldName.getText());
		System.out.println(fieldCapacity.getText());
		
		AppInput app = new Basicapp(AppKind.Basic);
		app.setCode(Integer.parseInt(fieldCode.getText()));
		app.setName(fieldName.getText());
		app.setCapacity(Integer.parseInt(fieldCapacity.getText()));
		appmanager.App_download(app);
		app.printInfo();
		putObject(appmanager, "appmanager.ser");
	}
	
	public static void putObject(AppManager appmanager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(appmanager);
			out.close();
			file.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
