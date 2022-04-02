public class App {
	int[] code = new int[100];
	String[] name = new String[100];
	int[] capacity = new int[100];
	
	public App() {
		
	}
	public App(int code, String name, int capacity, int num) {
		this.code[num] = code;
		this.name[num] = name;
		this.capacity[num] = capacity;
	}
	public void printInfo(int num) {
		System.out.println("code : " + code[num] + " name : " + name[num] + " capacity : " + capacity[num]);
	}
}
