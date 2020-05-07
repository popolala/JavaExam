package Exam4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Qn18 {
    public static void main(String [] args) {
        Locale.setDefault(new Locale("en", "US"));
        LocalDate date = LocalDate.parse("2018-09-10");
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
