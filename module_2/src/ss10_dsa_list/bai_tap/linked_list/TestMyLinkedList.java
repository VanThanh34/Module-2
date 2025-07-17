package module_2.src.ss10_dsa_list.bai_tap.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>("A");
        list.add("B");
        list.add("C");
        list.addFirst("Start");
        list.addLast("End");


        System.out.println("Index of B: " + list.indexOf("B"));
        System.out.println("Element at 3: " + list.get(3));

        list.remove(1);
        list.remove("End");


        MyLinkedList<String> list2 = list.clone();
        System.out.print("Clone: " + list2);

    }
}

