package Exam1;

import java.time.*;

public class Qn50 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDateTime obj = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println(instant);
        System.out.println(obj);

    }
}
// Instant is following UTC zone. There is no direct convertion of Instant class to LocatDateTime class.
