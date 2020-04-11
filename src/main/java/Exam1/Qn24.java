package Exam1;

import java.util.Arrays;
import java.util.Locale;

public class Qn24 {

    public static void main(String[] args) {
        Locale [] loc = Locale.getAvailableLocales();

        Arrays.stream(loc).filter(x -> x.getLanguage().equals("fr")).forEach(System.out::println);

    }
}

//Remember that locale language are in lowercase