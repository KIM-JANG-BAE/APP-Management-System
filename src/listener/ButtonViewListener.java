package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.AppViewer;
import gui.WindowFrame;
import manager.AppManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
		
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		AppViewer appviewer = frame.getAppviewer();
		AppManager appmanager = getObject("appmanager.ser");
		appviewer.setAppmanager(appmanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(appviewer);
		frame.revalidate();
		frame.repaint();

	}
	
	public static AppManager getObject(String fileName) {
		AppManager appmanager = null;
		FileInputStream file;
		try {
			file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			appmanager = (AppManager)in.readObject();
			in.close();
			file.close();
		}
		catch (FileNotFoundException e) {
			return appmanager;
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return appmanager;
	}

}
