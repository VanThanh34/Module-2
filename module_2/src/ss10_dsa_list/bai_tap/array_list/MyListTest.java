package module_2.src.ss10_dsa_list.bai_tap.array_list;


import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
        list.remove(1);
//        System.out.println(list.get(-1));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("Size is: "+list.size());
        MyList<Integer> list2 = list.clone();
        System.out.println(list2);
    }
}
