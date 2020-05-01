package java8;

public class ToIntFunction {

	public static void main(String[] args) {

		java.util.function.ToIntFunction<String> toIntFun = s -> s.length();
		
		System.out.println(toIntFun.applyAsInt("srikatnh" ));
	}

}
