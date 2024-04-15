package OOP7.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new Vector<>();


        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(list2);
    }


}
