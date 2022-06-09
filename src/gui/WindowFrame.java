package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AppManager;

public class WindowFrame extends JFrame {
	
	AppManager appmanager; 
	
	MenuSelection menuselection;
	AppAdder appadder; 
	AppViewer appviewer;
	
	public WindowFrame(AppManager appmanager) {
		
		this.appmanager = appmanager;
		this.menuselection = new MenuSelection(this);
		this.appadder = new AppAdder(this, this.appmanager); 
		this.appviewer = new AppViewer(this, this.appmanager);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AppAdder getAppadder() {
		return appadder;
	}

	public void setAppadder(AppAdder appadder) {
		this.appadder = appadder;
	}

	public AppViewer getAppviewer() {
		return appviewer;
	}

	public void setAppviewer(AppViewer appviewer) {
		this.appviewer = appviewer;
	}


}
