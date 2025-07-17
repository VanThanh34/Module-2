package module_2.src.ss10_dsa_list.bai_tap.array_list;


import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
    }

    private void grow() {
        int newCapacity = (int) (elements.length * 1.5f);
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }


        E removedElement = (E) elements[index];


        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }


        elements[size - 1] = null;
        size--;

        return removedElement;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                if (o == null) return i;
            } else {
                if (elements[i].equals(o)) return i;
            }
        }
        return -1;
    }
    public int size(){
        return size;
    }
    public MyList<E> clone() {
        MyList<E> clonedList = new MyList<>(elements.length);
        for (int i = 0; i < size; i++) {
            clonedList.add((E) elements[i]);
        }
        return clonedList;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
