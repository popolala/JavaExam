package Exam3;

import java.time.*;

public class Qn45 {
    public static void main(String [] args) {

        LocalDate date = LocalDate.of(2019, 1, 1);
        LocalTime time = LocalTime.of(0, 0);

        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zIndia = ZonedDateTime.of(date, time, india);

        System.out.println(zIndia);

        ZoneId us = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zUS = zIndia.withZoneSameLocal(us);
       //ZonedDateTime zUS = zIndia.withZoneSameInstant(us);

        System.out.println(zUS);

        System.out.println(Duration.between(zIndia, zUS)); //Line 15
    }
}
