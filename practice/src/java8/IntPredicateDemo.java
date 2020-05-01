package java8;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		
		int[] x = {1,35,6,3,45,63,23,34,34,2,4};
		IntPredicate intPredicate = i -> i % 2 == 0;
//		System.out.println(intPredicate.test(365));
		System.out.println("Even numbers");
		for(int y: x) {
			if(intPredicate.test(y)) {
				System.out.println(y);
			}
		}
	}
}
