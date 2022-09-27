package java8_dates;

import java.time.*;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			LocalDate date = LocalDate.now();
			System.out.println(date);
			LocalTime time = LocalTime.now();
			System.out.println("time " + time);
			LocalDateTime timeStamp = LocalDateTime.now();
			System.out.println("ts " + timeStamp);
			// LocalDate.of(int yr,int month,int day)
			System.out.println(LocalDate.of(2010, 12, 24));
			System.out.println("Enter date : yr-mon-day");
			System.out.println("You entered "+LocalDate.parse(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
