package module_2.src.ss10_dsa_list.bai_tap.linked_list;


public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes = 0;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    // Phương thức khởi tạo không tham số
    public MyLinkedList() {
    }

    // Thêm phần tử vào vị trí chỉ định
    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        numNodes++;
    }


    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node<E> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }

        numNodes--;
    }


    public int size() {
        return numNodes;
    }
}



