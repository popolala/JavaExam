package Others;

import java.util.*;

public class CheckNullObject {

    public static void main(String[] args) {

        //working
        Set<String> set = new HashSet<>();
        set.add(null);
        System.out.println("Set is "+set);

        //working
        List<String> list = new ArrayList<>();
        list.add(null);
        System.out.println("List is "+list);

        //working
        Map hashMap = new HashMap();
        hashMap.put(null , 1);
        System.out.println("HashMap is "+hashMap);

        //working
        List<String> linkedList = new LinkedList<>();
        linkedList.add(null);
        System.out.println("LinkedList is "+linkedList);

        //no working
        Deque<String> deque = new ArrayDeque<String>(list); //Line n2
        deque.add(null);
        System.out.println("Deque is "+deque);

        //no working
        Set<String> treeSet = new TreeSet<>();
        treeSet.add(null);
        System.out.println("TreeSet is "+set);

    }
}
