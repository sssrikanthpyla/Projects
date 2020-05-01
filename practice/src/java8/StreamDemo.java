package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("srikanth");
		names.add("satya");
		names.add("madhavi");
		names.add("simhachala");
		names.add("pyla");
		
		List<String> namesAfterFilter = names.stream().filter(s -> s.length()>4).collect(Collectors.toList());
		System.out.println(namesAfterFilter);
		List<String> toUpperCaseNames = namesAfterFilter.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(toUpperCaseNames);
		long countNames = names.stream().filter(s -> s.length()>4).count();
		System.out.println(countNames);
		List<String> sortedNames = toUpperCaseNames.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		List<String> reverseOrder = sortedNames.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(reverseOrder);
		String minVal = sortedNames.stream().min((o1,o2) -> o1.compareTo(o2)).get();
		System.out.println(minVal);
		String maxVal = sortedNames.stream().max((o1,o2) -> o1.compareTo(o2)).get();
		System.out.println(maxVal);
		names.stream().forEach(s -> System.out.print(s + " "));
		names.stream().forEach(System.out::println);
		String[] arrayNames = names.stream().toArray(String[]::new);
		for(String s : arrayNames) {
			System.out.print(s+" ");
		}
		Stream<String> streamArray = Stream.of(arrayNames);
		streamArray.forEach(System.out::println);
	}

}
