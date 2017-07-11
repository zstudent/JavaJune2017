package lesson170710.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Examples {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		Date time = Calendar.getInstance().getTime();
		
		System.out.println(time);
		
		
		System.out.println(LocalTime.now());
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(LocalDateTime.now());
		
		LocalDate birthday = LocalDate.of(1963,12,17);
		
		System.out.println(birthday.compareTo(now));
		
		System.out.println(birthday);
		
		
	}
	

}
