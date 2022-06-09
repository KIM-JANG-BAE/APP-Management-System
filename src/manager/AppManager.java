package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import app.App;
import app.AppInput;
import app.AppKind;
import app.Basicapp;
import app.Gameapp;
import app.SNSapp;
import app.Videoapp;

public class AppManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4061486018659734307L;
	ArrayList<AppInput> apps = new ArrayList<AppInput>();
	transient Scanner input;
	
	public AppManager(Scanner input){
		this.input = input;
	}
	
	public void App_download(String Code, String Name, int capacity) {
		AppInput newappinput = new Basicapp(AppKind.Basic);
		newappinput.getUserInput(input);
		apps.add(newappinput);
	}
	
	public void App_download(AppInput newappinput) {
		apps.add(newappinput);
	}

	
	public void App_download() {
		int kind = 0;
		AppInput newappinput;
		while(kind < 1 || kind > 4) {
			try {
				System.out.println("1 for Basic  ");
				System.out.println("2 for SNS  ");
				System.out.println("3 for Game  ");
				System.out.println("4 for Video  ");
				System.out.println("Select num for App Kind (between 1 to 4) : ");
				kind = input.nextInt();
				if(kind == 1) {
					newappinput = new Basicapp(AppKind.Basic);
					newappinput.getUserInput(input);
					apps.add(newappinput);
					break;
				}
				else if(kind == 2) {
					newappinput = new SNSapp(AppKind.SNS);
					newappinput.getUserInput(input);
					apps.add(newappinput);
					break;
				}
				else if(kind == 3) {
					newappinput = new Gameapp(AppKind.Game);
					newappinput.getUserInput(input);
					apps.add(newappinput);
					break;
				}
				else if(kind == 4) {
					newappinput = new Videoapp(AppKind.Video);
					newappinput.getUserInput(input);
					apps.add(newappinput);
					break;
				}
				else {
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void App_delete()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		int index = findIndex(appcode);
		removefromApp(index, appcode);
	}
	public int removefromApp(int index, int appcode) {
		if(index >= 0){
			apps.remove(index);
			System.out.println("the App "+ appcode +" is deleted");
			return 1;
		}
		else{
			System.out.println("the App has not been download");
			return -1;
		}
	}
	public int findIndex(int appcode) {
		int index = -1;
		for(int i = 0; i<apps.size(); i++) {
			if(apps.get(i).getCode() == appcode) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void App_update()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		for(int i = 0; i<apps.size(); i++) {
			AppInput app = apps.get(i);
			if(app.getCode() == appcode) {
				int num = -1;
				while(num != 4) {
					showUpdateMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						app.setAppcode(input);
						break;
					case 2:
						app.setAppname(input);
						break;
					case 3:
						app.setAppcapacity(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void App_list()
	{
		for(int i = 0; i < apps.size(); i ++) {
			apps.get(i).printInfo();
		}
	}
	public void setAppcode(AppInput app, Scanner input) {
		System.out.println("App code : ");
		int code = input.nextInt();
		app.setCode(code);
	}
	
	public void setAppname(AppInput app, Scanner input) {
		System.out.println("App name : ");
		String name = input.next();
		app.setName(name);
	}
	public void setAppcapacity(AppInput app, Scanner input) {
		System.out.println("App capacity : ");
		int capacity = input.nextInt();
		app.setCapacity(capacity);
	}
	
	public int size() {
		return apps.size(); 
	}
	
	public AppInput get(int index) {
		return (App) apps.get(index);
	}
	
	public void showUpdateMenu() {
		System.out.println("** App Update Menu **");
		System.out.println("1. Update code");
		System.out.println("2. Update name");
		System.out.println("3. Update capacity");
		System.out.println("4. Exit");
		System.out.print("input number :");
	}

}
