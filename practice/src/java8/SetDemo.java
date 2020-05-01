package java8;

import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>((f, s) -> (f > s) ? -1 : (f < s) ? +1 : 0);
		t.add(3);
		t.add(5);
		t.add(2);
		t.add(4);
		System.out.println(t);
	}

}
