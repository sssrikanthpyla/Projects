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
		//prime.find(100);
		
		FuncInterface2 isPrime = (n -> {
			if(n<=1) {
				return false;
			}
			if(n==2) {
				return true;
			}
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		});
		
		FuncInterface findPrime = (n -> {
			int count=0;
			for(int i=0;i<=n;i++) {
				if(isPrime.find(i)) {
					count++;
					System.out.print(i+" ");
				}
			}
			System.out.println();
			System.out.println("count is "+ count);
			float per=(count*100)/n;
			System.out.println("persent of prime numbers "+ per);
		});
		findPrime.find(50000);
	}

}
