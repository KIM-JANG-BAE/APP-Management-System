package app;
import java.io.Serializable;
import java.util.Scanner;

import exception.SubappFormatException;

public abstract class App implements AppInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5707742383128448606L;
	
	protected int code;
	protected String name;
	protected int capacity;
	protected AppKind kind = AppKind.Basic;
	protected String subapp;
	
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
	public void setsubapp(String subapp) throws SubappFormatException{
		if(!subapp.contains("@") && !subapp.equals("")) {
			throw new SubappFormatException();
		}
		this.subapp = subapp;	
	}
	public String subapp() {
		return subapp;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setAppcode(Scanner input) {
		System.out.println("App code : ");
		int code = input.nextInt();
		this.setCode(code);
	}
	
	public void setAppname(Scanner input) {
		System.out.println("App name : ");
		String name = input.next();
		this.setName(name);
	}
	public void setAppcapacity(Scanner input) {
		System.out.println("App capacity : ");
		int capacity = input.nextInt();
		this.setCapacity(capacity);
	}
	public void setAppsub(Scanner input) {
		String namesub = "";
		while(!namesub.contains("@")) { 
			System.out.println("Supportinng app:");
			namesub = input.next();
			try {
				this.setsubapp(namesub);
			}
			catch(SubappFormatException e) {
				System.out.println("Incorrect Email Format. put the name of subapp that contains @");
			}
		}
	}
	
	public String getKindString() {
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
		return skind;
	}
	
	public abstract void printInfo();
	
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
