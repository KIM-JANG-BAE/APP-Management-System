import java.util.Scanner;

public class Videoapp extends App {
	public void getUserInput(Scanner input) {
		
		System.out.print("APP code:");
		int code = input.nextInt();
		this.setCode(code);
	
		int answer = -1;
		while(answer != 0 && answer != 1) {
			System.out.println("Do you have a specific name? (Y : 0/N : 1) ");
			answer = input.nextInt();
			if(answer == 0) {
				System.out.println("number : ");
				int trash = input.nextInt();
				System.out.println("APP name:");
				String name = input.next();
				this.setName(name);
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

}
