package practice;

public class MainThread {

	public static void main(String[] args) {
		ThreadDemo threadDemo = new ThreadDemo();
		Thread thread = new Thread(threadDemo);
		thread.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}
	}

}
