package practice;

public class Scope {

	public static int x = 10;
	public static void main(String[] args) {

		
		s(x);
		System.out.println(x);
		
	}

	public static void s(int x) {
		x =15;
	}
}
