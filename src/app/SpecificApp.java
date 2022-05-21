package app;
import java.util.Scanner;

import exception.SubappFormatException;

public abstract class SpecificApp extends App {
	
	public SpecificApp(AppKind kind) {
		super(kind);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind + " code : " + code + " name : " + name + " capacity : " + capacity + " supporting app name :" + subapp );
	}
	
	public void setAppnamewithYN(Scanner input) {
		int answer = -1;
		while(answer != 0 && answer != 1) {
			try {
				System.out.println("Do you have a supporting app? (Y : 0/N : 1) ");
				answer = input.nextInt();
				if(answer == 0) {
					System.out.println("Re-enter number : ");
					int trash = input.nextInt();
					setAppsub(input);
					break;
				}
				else if(answer == 1) {
					this.setsubapp("");
					break;
				}
			}
			catch(SubappFormatException e) {
				System.out.println("Incorrect Email Format. put the name of subapp that contains @");
			}
		}
	}

	public abstract void getUserInput(Scanner input);

}
