package java8;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.printf("%d-%d-%d", day,month,year);
		System.out.println();
		
		System.out.println("---------------------------");
		
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		System.out.printf("%d:%d:%d", hour,min,sec);
		System.out.println();
		System.out.println("-------------------------");
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		
		int day2 = dateAndTime.getDayOfYear();
		System.out.println(day2);
		
		System.out.println("---------------------------");
		LocalDate ld = LocalDate.of(1990, 11, 7);
		LocalDate now = LocalDate.now();
		Period period = Period.between(ld, now);
		System.out.println(period);
		System.out.printf("%d years %d months %d days", period.getYears(),period.getMonths(),period.getDays());
		System.out.println();
		
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		ZoneId us = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(us);
		System.out.println(dt);
	}
}
