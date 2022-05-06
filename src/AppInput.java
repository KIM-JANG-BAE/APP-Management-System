import java.util.Scanner;

public interface AppInput {
	public int getCode();
	
	public void setCode(int code);
	
	public void setName(String name);
	
	public void setCapacity(int capacity);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
