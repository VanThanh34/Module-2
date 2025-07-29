package ss11_stack_queue.bai_tap.map;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapCountChar {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("hehe", 1);
        map.put("hoHo", 2);
        map.put("hihi", 3);

        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key.toLowerCase() + " quantity: "  + map.get(key));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key u wanna check: ");
        String s = sc.nextLine();
        if(map.containsKey(s.toLowerCase())) {
        for (String key : map.keySet()) {
            if (key.equalsIgnoreCase(s) ) {
                map.put(key, map.get(key) + 1);
            }
            System.out.println(key.toLowerCase()+" quantity change: "+  map.get(key));
        }
        }else {
            map.put(s, 1);
            System.out.println("Result: "+map);
        }

    }
}
