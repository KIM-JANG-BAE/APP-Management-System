public class App {
	int code;
	String name;
	int capacity;
	
	public App() {
		
	}
	
	public App(int code, String name, int capacity) {
		this.code = code;
		this.name = name;
		this.capacity = capacity;
	}
	
	public void printInfo() {
		System.out.println("code : " + code + " name : " + name + " capacity : " + capacity);
	}
}
