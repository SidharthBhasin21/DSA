package Collections.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(56);
        list.add(17);
        list.add(7);
        list.add(27);

        System.out.println(list.toString());

    }
}
