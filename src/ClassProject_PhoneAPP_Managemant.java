import java.util.Scanner;

public class ClassProject_PhoneAPP_Managemant {

	public static void main(String[] args) {
		int num = 0;
	
		Scanner input = new Scanner(System.in);
		AppManager appmanager = new AppManager(input);
		while(num != 5) {
		    System.out.println("Kim.J.B's phone APP");
		    System.out.println("1. APP Download");
		    System.out.println("2. APP Delete");
		    System.out.println("3. APP Update");
		    System.out.println("4. APP List");
		    System.out.println("5. Exit");
		    System.out.print("Select one number between 1-5:");
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
		    case 5:
		    	continue;
		    }
		}
	}
}
