package Map;

import java.util.*;

public class LearnMaps {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("in", "India");
        map.put("us", "United States");
        map.put("ch", "China");

        Set<String> set = map.keySet();

        System.out.println(set);
        System.out.println(map.containsKey("sid"));

        System.out.println(map);
    }
}
