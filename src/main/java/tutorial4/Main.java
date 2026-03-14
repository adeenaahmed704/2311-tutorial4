package tutorial4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Thread.sleep(10000); // 10 seconds to attach debugger
		int a = 10;
		int b = 20;
		int sum = add(a, b);
		System.out.println("The sum is: " + sum);
		//Thread.sleep(10000); // 10 seconds to attach debugger
	}
	public static int add(int a, int b) {
		int s = a + b;
		return s;
	}
}
