package java8;

import java.util.function.Supplier;

public class OTPGenarator {

	public static void main(String[] args) {

		Supplier<String> otpGenerator = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp+ (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(otpGenerator.get());
	}

}
