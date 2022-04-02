import java.util.Scanner;

public class AppManager {
	App App = new App();
	Scanner input;
	
	AppManager(Scanner input){
		this.input = input;
	}
	
	public void App_download() {
		System.out.print("App order:");
		int num1 = input.nextInt();
		System.out.print("APP code:");
    	App.code[num1] = input.nextInt();
    	input.nextLine();
    	System.out.print("APP name:");
    	App.name[num1] = input.nextLine();
    	System.out.print("APP capacity:");
    	App.capacity[num1] = input.nextInt();
	}
	
	public void App_delete()
	{
		System.out.print("App order:");
		int num1 = input.nextInt();
		System.out.print("APP code:");
		int appcode = input.nextInt();
		if(App.code == null) {
			System.out.println("Any App has not been download");
			return;
		}
		else if(App.code[num1] != appcode) {
			System.out.println("the App has not been download");
			return;
		}
		else if(App.code[num1] == appcode){
			App.code[num1] = 0; 
			System.out.println("the App is deleted.");
		}
	}
	
	public void App_update()
	{
		System.out.print("App order:");
		int num1 = input.nextInt();
		System.out.print("APP code:");
		int appcode = input.nextInt();
		if(App.code[num1] == appcode) {
			System.out.println("the App to be update is " + appcode);
			System.out.println("Update App code data :");
			int replace1 = input.nextInt();
			App.code[num1] = replace1;
		}
	}
	
	public void App_list()
	{
		System.out.print("App order:");
		int num1 = input.nextInt();
		System.out.print("APP code:");
		int appcode = input.nextInt();
		if(App.code[num1] == appcode) {
			App.printInfo(num1);
		}
	}

}
