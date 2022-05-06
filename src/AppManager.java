import java.util.ArrayList;
import java.util.Scanner;

public class AppManager {
	ArrayList<AppInput> apps = new ArrayList<AppInput>();
	Scanner input;
	
	AppManager(Scanner input){
		this.input = input;
	}
	
	public void App_download() {
		int kind = 0;
		AppInput newappinput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
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
			AppInput appinput = apps.get(i);
			if(appinput.getCode() == appcode) {
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
						appinput.setCode(code);
					}
					else if(num == 2) {
						System.out.println("App name : ");
						String name = input.nextLine();
						appinput.setName(name);
					}
					else if(num == 3) {
						System.out.println("App capacity : ");
						int capacity = input.nextInt();
						appinput.setCapacity(capacity);
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
