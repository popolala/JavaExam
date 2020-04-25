package Exam1;

import java.time.*;

public class Qn74 {
    public static void main(String [] args) {
        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t2, t1));
    }
}

/*
Duration method takes in 2 arguments of type Temporal class. It is dangerous because if 2 arguments are of different type,
it will convert 2nd argument to 1st argument and this may cause RuntimeException to occur.

From above, there is no way to convert LocalTime to LocalDateTime. So DateTimeException occurs.
*/
