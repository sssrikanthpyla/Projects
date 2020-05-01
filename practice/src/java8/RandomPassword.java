package java8;

import java.util.function.Supplier;

public class RandomPassword {

	public static void main(String[] args) {

		Supplier<String> passwordGenarator = () -> {
			String pass = "";
			String alph = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm@#$";
			Supplier<Integer> randomNumber = () -> (int)(Math.random()*10);
			Supplier<Character> randomChar = () -> alph.charAt((int)(Math.random()*56));
			for (int i = 0; i < 8; i++) {
				if(i%2 == 0) {
					pass = pass + randomNumber.get();
				}else {
					int s = (int)(Math.random()*56);
					pass = pass + randomChar.get();
				}
			}
			return pass;
		};
		
		System.out.println(passwordGenarator.get());
		
    
	}

}
