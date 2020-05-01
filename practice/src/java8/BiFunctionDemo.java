package java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

//		BiFunction<Integer, Integer, Double> biFunction = (a,b) -> (double) a*a / b ;
//		System.out.println(biFunction.apply(4, 6));
		
		BiFunction<String, Integer, Student> biFunction2 = (name, rollNo) -> new Student(name,rollNo);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(biFunction2.apply("srikanth", 101));
		al.add(biFunction2.apply("madhavi", 102));
		al.add(biFunction2.apply("simhachala", 103));
		al.add(biFunction2.apply("satya", 104));
		al.add(biFunction2.apply("pyla", 105));
		
		for(Student s : al) {
			System.out.println(s.getName()+", "+ s.getRollNo());
		}
	}

}
