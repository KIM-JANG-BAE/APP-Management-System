import java.util.Scanner;

public class Videoapp extends App implements AppInput{
	
	public Videoapp(AppKind kind) {
		super(kind);
	}
	
	protected String subapp;
	public void getUserInput(Scanner input) {
		
		System.out.print("APP code:");
		int code = input.nextInt();
		this.setCode(code);
	
		int answer = -1;
		while(answer != 0 && answer != 1) {
			System.out.println("Do you need a supporting app? (Y : 0/N : 1) ");
			answer = input.nextInt();
			if(answer == 0) {
				System.out.println("Re-enter number : ");
				int trash = input.nextInt();
				System.out.println("APP name:");
				String name = input.next();
				this.setName(name);
				System.out.println("Supporting APP name:");
				subapp = input.next();
				break;
			}
			else if(answer == 1) {
				this.setName("Video");
				break;
			}
		}
		
		System.out.print("APP capacity:");
		int capacity = input.nextInt();	
		this.setCapacity(capacity);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Basic:
			skind = "Basic";
			break;
		case SNS:
			skind = "SNS";
			break;
		case Game:
			skind = "Game";
			break;
		case Video:
			skind = "Video";
			break;
		default:
		}
		System.out.println("kind : "+ skind + " code : " + code + " name : " + name + " capacity : " + capacity + " supporting app name :" + subapp );
	}
}
