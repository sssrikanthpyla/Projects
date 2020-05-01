package java8;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(0);
		al.add(9);
		al.add(8);
		System.out.println(al);
		Collections.sort(al, (f, s) -> f > s ? -1 : f < s ? +1 : 0);
		System.out.println(al);
	}

}
