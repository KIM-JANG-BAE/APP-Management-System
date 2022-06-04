package app;
import java.util.Scanner;

public interface AppInput {
	public int getCode();
	
	public void setCode(int code);
	
	public void setName(String name);
	 
	public void setCapacity(int capacity);
	
	public String getName();
	
	public int getCapacity();
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setAppcode(Scanner input);
	public void setAppname(Scanner input);
	public void setAppcapacity(Scanner input);
	public void setAppsub(Scanner input);
}
