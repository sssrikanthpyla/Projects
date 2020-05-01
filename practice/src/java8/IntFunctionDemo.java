package java8;

import java.util.function.IntFunction;

public class IntFunctionDemo {
	public static void main(String[] args) {

		int[] x = { 1, 35, 6, 3, 45, 63, 23, 34, 34, 2, 4 };
		IntFunction<Integer> iFunction = i -> i * i;
		for(int y : x) {
			System.out.println(iFunction.apply(y));
		}
	}
}
