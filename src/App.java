import java.util.Scanner;

public class App {
	AppKind Basic;
	protected int code;
	protected String name;
	protected int capacity;
	protected AppKind kind;
	
	public App() {
		
	}
	public App(AppKind kind, int code, String name, int capacity) {
		this.kind = kind;
		this.code = code;
		this.name = name;
		this.capacity = capacity;
	}
	public App(AppKind kind) {
		this.kind = kind;
	}
	
	public AppKind getKind() {
		return kind;
	}
	public void setKind(AppKind kind) {
		this.kind = kind;
	}
	public AppKind getBasic() {
		return Basic;
	}
	public void setBasic(AppKind basic) {
		Basic = basic;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
		System.out.println("kind : "+ skind + "code : " + code + " name : " + name + " capacity : " + capacity);
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
}
