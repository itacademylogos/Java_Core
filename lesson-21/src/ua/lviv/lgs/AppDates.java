package ua.lviv.lgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AppDates {
	public static void main(String[] args) {

		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.plusDays(2).plusMonths(1).plusWeeks(2).plusYears(1));
		System.out.println(ld.getEra());
		System.out.println(ld.isLeapYear());
		System.out.println(ld.atStartOfDay());
		System.out.println(LocalDate.ofEpochDay(12312312));
		
		LocalTime lt = LocalTime.now();
		
		System.out.println(lt);
		System.out.println(lt.plusHours(2).plusMinutes(5).plusNanos(564).plusSeconds(32));
		System.out.println(lt.truncatedTo(ChronoUnit.HOURS));

		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println(cdt.plusDays(2).plusMonths(1).plusWeeks(2).plusYears(1));
		System.out.println(cdt.plusHours(2).plusMinutes(5).plusNanos(564).plusSeconds(32));
		
		
		
	}
}
