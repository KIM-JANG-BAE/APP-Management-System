import java.util.Scanner;

public class AppManager {
	App App;
	Scanner input;
	
	AppManager(Scanner input){
		this.input = input;
	}
	
	public void App_download() {
		App = new App();
		System.out.print("APP code:");
    	App.code = input.nextInt();
    	input.nextLine();
    	System.out.print("APP name:");
    	App.name = input.nextLine();
    	System.out.print("APP capacity:");
    	App.capacity = input.nextInt();
	}
	
	public void App_delete()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		if(App == null) {
			System.out.println("the App has not been download");
			return;
		}
		else if(App.code == appcode){
			App = null; 
			System.out.println("the App is deleted.");
		}
	}
	
	public void App_update()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		if(App.code == appcode) {
			System.out.println("the App to be update is " + appcode);
		}
	}
	
	public void App_list()
	{
		System.out.print("APP code:");
		int appcode = input.nextInt();
		if(App.code == appcode) {
			App.printInfo();
		}
	}

}
