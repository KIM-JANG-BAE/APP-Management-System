import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassProject_PhoneAPP_Managemant {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		AppManager appmanager = new AppManager(input);
		selectMenu(input, appmanager);
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
		    		break;	
		    	case 2:
		    		appmanager.App_delete();
		    		break;
		    	case 3:
		     		appmanager.App_update();
		     		break;
		    	case 4:
		    		appmanager.App_list();
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
}
