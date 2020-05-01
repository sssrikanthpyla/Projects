package java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckingUser {

	public static void main(String[] args) {

		Predicate<User> predicate = user -> user.getUserName().equals("srikanth") && user.getPassword().equals("madhu");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User name");
		String userName = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		User user = new User(userName, password);
		if (predicate.test(user)) {
			System.out.println("Successfully LogedIn");
		} else {
			System.out.println("Try again");
		}
	}
}
