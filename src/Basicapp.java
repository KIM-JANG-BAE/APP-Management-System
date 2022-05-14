

import java.util.Scanner;

public class Basicapp extends App{
	
	public Basicapp(AppKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		setAppcode(input);
    	
    	setAppname(input);
    	
    	setAppcapacity(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind + " code : " + code + " name : " + name + " capacity : " + capacity);
	}

	public void setappsub(String subapp) throws SubappFormatException {
	}
}
