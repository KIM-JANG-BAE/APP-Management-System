import java.util.ArrayList;
import java.util.Scanner;

public class AppManager {
	ArrayList<App> apps = new ArrayList<App>();
	Scanner input;
	
	AppManager(Scanner input){
		this.input = input;
	}
	
	public void App_download() {
		int kind = 0;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1 for Basic  ");
			System.out.println("2 for SNS  ");
			System.out.println("3 for Game  ");
			System.out.println("4 for Video  ");
			System.out.println("Select num for App Kind (between 1 to 4) : ");
			kind = input.nextInt();
			if(kind == 1) {
				App newapp = new App();
				newapp.getUserInput(input);
				apps.add(newapp);
				break;
			}
			else if(kind == 2) {
				App newapp = new SNSapp();
				newapp.getUserInput(input);
				apps.add(newapp);
				break;
			}
			else if(kind == 3) {
				App newapp = new Gameapp();
				newapp.getUserInput(input);
				apps.add(newapp);
				break;
			}
			else if(kind == 4) {
				App newapp = new Videoapp();
				newapp.getUserInput(input);
				apps.add(newapp);
				break;
			}
			else {
			
			}
		}
	}
	
	public void App_delete()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		int index = -1;
		for(int i = 0; i<apps.size(); i++) {
			if(apps.get(i).getCode() == appcode) {
				index = i;
				break;
			}
		}
		if(index >= 0){
			apps.remove(index);
			System.out.println("the App "+ appcode +" is deleted");
		}
		else{
			System.out.println("the App has not been download");
		}
	}
	
	public void App_update()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		for(int i = 0; i<apps.size(); i++) {
			App app = apps.get(i);
			if(app.getCode() == appcode) {
				int num = -1;
				while(num != 5) {
					System.out.println("** App Update Menu **");
					System.out.println("1. Update code");
					System.out.println("2. Update name");
					System.out.println("3. Update capacity");
					System.out.println("4. Exit");
					if(num == 1) {
						System.out.println("App code : ");
						int code = input.nextInt();
						app.setCode(code);
					}
					else if(num == 2) {
						System.out.println("App name : ");
						String name = input.nextLine();
						app.setName(name);
					}
					else if(num == 3) {
						System.out.println("App capacity : ");
						int capacity = input.nextInt();
						app.setCapacity(capacity);
					}
					else{
						continue;
					}
				}
			}
		}	
	}
	
	public void App_list()
	{
		for(int i = 0; i < apps.size(); i ++) {
			apps.get(i).printInfo();
		}
	}

}
