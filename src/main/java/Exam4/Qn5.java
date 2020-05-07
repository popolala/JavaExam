package Exam4;

import java.util.ArrayList;
import java.util.List;

class bb {

}

public class Qn5 {
    public static void main(String[] args) {

        bb b = new bb();
        List list = new ArrayList<String>();
        list.add(1);
        //list.add(bb);
        list.add(true);
        list.add("2");
        list.forEach(System.out::print);
    }
}
