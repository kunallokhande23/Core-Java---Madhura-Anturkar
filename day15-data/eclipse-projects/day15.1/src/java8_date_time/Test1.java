package java8_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test1 {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		System.out.println(d1);//yyyy-MM-dd
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		LocalDateTime dt1=LocalDateTime.now();
		System.out.println(dt1);
		LocalDate d2=LocalDate.of(2020, 12, 31);//yr mon day
		System.out.println(d2);

	}

}
