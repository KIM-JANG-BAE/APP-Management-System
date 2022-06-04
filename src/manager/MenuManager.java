package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;
 
public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AppManager appmanager = getObject("appmanager.ser");
		if(appmanager == null) {
			appmanager = new AppManager(input);
		}
		
		WindowFrame frame = new WindowFrame(appmanager);
		selectMenu(input, appmanager);
		putObject(appmanager, "appmanager.ser");
	}
	
	public static void selectMenu(Scanner input, AppManager appmanager) {
		int num = -1;
		while(num != 5) {
			try {
			showMenu();
		    num = input.nextInt();
		    switch(num) {
		    	case 1:
		    		appmanager.App_download();
		    		logger.log("add a app");
		    		break;	
		    	case 2:
		    		appmanager.App_delete();
		    		logger.log("delete a app");
		    		break;
		    	case 3:
		     		appmanager.App_update();
		     		logger.log("edit a app");
		     		break;
		    	case 4:
		    		appmanager.App_list();
		    		logger.log("view a list of app");
		    		break;
		    	default:
		    		continue;
		    	}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
				System.out.println(num);	
			}
		}
	}
	public static void showMenu() {
		System.out.println("Kim.J.B's phone APP");
	    System.out.println("1. APP Download");
	    System.out.println("2. APP Delete");
	    System.out.println("3. APP Update");
	    System.out.println("4. APP List");
	    System.out.println("5. Exit");
	    System.out.print("Select one number between 1-5:");
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
