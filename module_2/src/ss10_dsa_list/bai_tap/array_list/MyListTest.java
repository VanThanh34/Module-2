package module_2.src.ss10_dsa_list.bai_tap.array_list;




public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0, "A");
        list.add(1, "B");
        list.add(2, "C");
        list.remove(0);
        String removed = list.remove(1);
        System.out.println("Đã xóa phần tử: " + removed);
        System.out.println("Size: " + list.size());
    }
}
