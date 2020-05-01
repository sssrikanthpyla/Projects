package java8;

public class LamdaDemo {

	public static void main(String[] args) {
		LambdaInterface lambdaInterface = (s) -> s.length();
		System.out.println(lambdaInterface.printName("srikanth"));
		AddInterface addInterface = (a,b) -> a+b;
		System.out.println(addInterface.add(100, 122));
		
	}

}
