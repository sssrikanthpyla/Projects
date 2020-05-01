package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CheckNames {

	public static void main(String[] args) {
		String[] names = { "madhu", "srikanth", "madhuri", "", "madhavi", null };
		Predicate<String> predicate = s -> s.startsWith("m") || s.charAt(0) == 's';
		Predicate<String> predicate2 = s -> s != null && s.length() != 0;
		// m1(predicate,names);
		System.out.println("-------------------------------");
		m2(predicate2, names);
	}

	public static void m1(Predicate<String> predicate, String[] names) {
		for (String name : names) {
			if (predicate.test(name)) {
				System.out.println(name);
			}
		}
	}
	
	public static void m2(Predicate<String> predicate, String[] names) {
		ArrayList<String> al = new ArrayList<>();
		for(String name : names) {
			if(predicate.test(name)) {
				al.add(name);
			}
		}
		System.out.println(al);
	}

}
