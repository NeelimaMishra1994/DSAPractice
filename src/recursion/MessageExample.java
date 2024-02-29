package recursion;

public class MessageExample{

	public static void main(String[] args) {
			message();
	}
	static void message() {
		System.out.println("Heelo world");
		message1();
	}
	static void message1() {
		System.out.println("Heelo world");
		message2();
	}
	static void message2() {
		System.out.println("Heelo world");
		message3();
	}
	static void message3() {
		System.out.println("Heelo world");
		message4();
	}
	static void message4() {
		System.out.println("Heelo world");
	}

}
