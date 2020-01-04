package Lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		FuncInterface prime = (n -> {
			for (int x = 2; x <= n; x++) {
				boolean isprime = true;
				for (int i = 2; i < x / 2; i++) {
					if (x % i == 0) {
						isprime = false;
						break;
					}
				}
				if (isprime) {
					System.out.print(x + " ");
				}
			}
		});
		prime.find(100);
	}

}
