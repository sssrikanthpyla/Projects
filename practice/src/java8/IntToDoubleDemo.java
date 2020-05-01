package java8;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleDemo {

	public static void main(String[] args) {

		IntToDoubleFunction itdFun = i -> (double)i*i / 5;
		System.out.println(itdFun.applyAsDouble(6));
	}

}
