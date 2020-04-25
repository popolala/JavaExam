package Exam1;

import java.util.*;

public class Qn63 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(25, "Pune");
        map.put(32, "Mumbai");
        map.put(11, "Sri Nagar");
        map.put(39, "Chennai");

        System.out.println(map.headMap(25, true));
    }
}

//headMap(K toKey, boolean inclusive) => returns the map till toKey, if inclusive is true. Hence the output is: {11=Sri Nagar, 25=Pune}.