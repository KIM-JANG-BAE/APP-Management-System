import java.util.Scanner;

public class ClassProject_PhoneAPP_Managemant {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		while(num != 6) {
		    System.out.println("Kim.J.B's phone APP");
		    System.out.println("1. APP Download");
		    System.out.println("2. APP Delete");
		    System.out.println("3. APP Update");
		    System.out.println("4. APP List");
		    System.out.println("5. Show a Menu");
		    System.out.println("6. Exit");
		    System.out.print("Select one number between 1-6:");
		    num = input.nextInt();
		    switch(num) {
		    case 1:
		    	App_download();
		    	break;
		    case 2:
		    	App_delete();
		    	break;
		    case 3:
		    	App_update();
		    	break;
		    case 4:
		    	App_list();
		    	break;
		    case 5:
		    case 6:
		    	continue;
		    }
		}
	}
	public static void App_download() {	
		Scanner input = new Scanner(System.in);
		System.out.print("APP code:");
    	int Appcode = input.nextInt();
    	input.nextLine();
    	System.out.print("APP name:");
    	String Appname = input.nextLine();
    	System.out.print("APP capacity:");
    	int Appcapacity = input.nextInt();
	}
	
	public static void App_delete()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("APP code:");
		int Appcode = input.nextInt();
		
	}
	public static void App_update()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("APP code:");
		int Appcode = input.nextInt();
		
	}
	public static void App_list()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("APP code:");
		int Appcode = input.nextInt();
		
	}
}
