

import java.util.Scanner;

public class Basicapp extends App implements AppInput {
	
	public Basicapp(AppKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("APP code:");
    	int code = input.nextInt();
    	this.setCode(code);
    	
    	input.nextLine();
    	
    	System.out.print("APP name:");
    	String name = input.nextLine();
    	this.setName(name);
    	
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
		System.out.println("kind : "+ skind + " code : " + code + " name : " + name + " capacity : " + capacity);
	}

}
