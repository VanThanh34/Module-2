package module_2.src.ss10_dsa_list.bai_tap.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add(0, "A");
        list.add(1, "B");
        list.add(1, "C");
        list.remove(0);
        System.out.println("Size: " + list.size());
    }
}


