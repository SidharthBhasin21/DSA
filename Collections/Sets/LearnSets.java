package Collections.Sets;

import java.util.*;

public class LearnSets {
    public static void main(String[] args) {

        Set s = new HashSet();
        s.add(new Long(10));
        s.add(new Integer(10));

        for (Object obj : s) {
            System.out.print("test - " + obj);
        }
    }
}
