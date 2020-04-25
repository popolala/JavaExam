package Exam1;


import java.util.Locale;
import java.util.ResourceBundle;

public class Qn60 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr", "CA"));
        Locale loc = new Locale("en", "IN");
        ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle", loc);
        System.out.println(rb.getObject("locale"));
    }
}

//Note that rb.getObject will only find the key of the specific properties file.