import java.util.Scanner;

public class SNSapp extends SpecificApp{
	
	public SNSapp(AppKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAppcode(input);
		setAppname(input);
		setAppnamewithYN(input);
		setAppcapacity(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind + " code : " + code + " name : " + name + " capacity : " + capacity + " supporting app name :" + subapp);
	}
}
