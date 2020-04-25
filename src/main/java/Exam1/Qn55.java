package Exam1;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;


public class Qn55 {
    public static void main(String[] args) {

        Locale loc = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("RB", loc);

        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String val = bundle.getString(key);
            System.out.println(key + "=" + val);
        }
    }
}

//ResourceBundle will loop through all the files in following manner from most restrictive to less restrictive. RB will always prioritise on RB_en_US.properties file

/*
1. RB_en_US.properties [parent = 'RB_en.properties']
2. RB_en.properties [parent = 'RB.properties']
3. RB.properties [parent = null]


bundle.getKeys(); will get all unique keys from these 3 files in the order of. If duplicate keys found , it will skip.
 */

