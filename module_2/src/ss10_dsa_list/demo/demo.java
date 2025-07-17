package module_2.src.ss10_dsa_list.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class demo {

    public static void main(String[] args) {
        /*Integer[] arr = {1,2,3,4,5,6,7};
        Collection<Integer> a = Arrays.asList(arr) ;*/
        ArrayList<Integer> b = new ArrayList<>(5);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.remove(3);
        b.add(3, 4);
        System.out.println(b);
    }
}
