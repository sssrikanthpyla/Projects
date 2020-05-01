package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EligiblePeople {

	public static void main(String[] args) {

		ArrayList<People> al = new ArrayList<People>();
		al.add(new People("srikanth", 29, true));
		al.add(new People("madhavi", 24, true));
		al.add(new People("satya", 23, false));
		al.add(new People("simhachala", 27, false));
		al.add(new People("madhu", 23, true));

		Predicate<People> predicate = people -> people.isEligible() && people.getAge() > 21;

		for (People p : al) {
			if (predicate.test(p)) {
				System.out.println("You are eligible " + p.getName());
			}
		}
	}
}
