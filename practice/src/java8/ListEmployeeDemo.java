package java8;

import java.util.ArrayList;
import java.util.Collections;

public class ListEmployeeDemo {

	public static void main(String[] args) {
		ArrayList<EmployeeDemo> al = new ArrayList<EmployeeDemo>();
		al.add(new EmployeeDemo(3, "srikanth"));
		al.add(new EmployeeDemo(5, "madhavi"));
		al.add(new EmployeeDemo(4, "srinu"));
		al.add(new EmployeeDemo(7, "simhachala"));
		al.add(new EmployeeDemo(6, "satya"));
		
		Collections.sort(al,(f, s) -> f.getId() > s.getId() ? -1 : f.getId() < s.getId() ? +1 : 0);
		System.out.println(al);
	}
}
