package java8;

import java.util.function.Function;

public class Functiondemo {

	public static void main(String[] args) {

		Function<String, Integer> function = s -> s.length();
//		System.out.println(function.apply("srikanth"));
		Function<String,String> function2 = s -> s.trim();
		System.out.println(function2.apply("    Sriaknth s "));
	}

}
