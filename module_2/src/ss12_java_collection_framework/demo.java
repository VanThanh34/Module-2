package module_2.src.ss12_java_collection_framework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Ba");
        map.put(1, "Một");
        map.put(2, "Hai");
        System.out.println(map);
// In: {1=Một, 2=Hai, 3=Ba}


    }
}
