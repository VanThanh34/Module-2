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


    public MyLinkedList(E data) {
        head = new Node<>(data);
        numNodes++;
    }


    public void add(E element) {
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(element);
        numNodes++;
    }


    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }


    public void addLast(E element) {
        add(element);
    }


    public void remove(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> prev = head;
            for (int i = 0; i < index - 1; i++) prev = prev.next;
            prev.next = prev.next.next;
        }
        numNodes--;
    }


    public boolean remove(Object o) {
        if (head == null) return false;
        if (o.equals(head.data)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node<E> current = head;
        while (current.next != null) {
            if (o.equals(current.next.data)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public E get(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();
        Node<E> temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp.data;
    }


    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        if (head == null) return null;
        MyLinkedList<E> newList = new MyLinkedList<>(head.data);
        Node<E> current = head.next;
        while (current != null) {
            newList.add(current.data);
            current = current.next;
        }
        return newList;
    }



    public int indexOf(E o) {
        Node<E> temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (o.equals(temp.data)) return i;
            temp = temp.next;
        }
        return -1;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> temp = head;
        sb.append("[");
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

}

