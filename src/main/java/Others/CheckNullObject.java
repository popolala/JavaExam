package Others;

import java.util.*;

public class CheckNullObject {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add(null);

        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add(null);

        System.out.println(list);

        Deque<String> deque = new ArrayDeque<String>(list); //Line n2
        deque.add(null);

        System.out.println(deque);



    }
}
