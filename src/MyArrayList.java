import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class MyArrayList<T> {
    private T[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    MyArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    MyArrayList(int size) {
        array = (T[]) new Object[size];
    }


    public int getSize() {
        return size;
    }

    public void add(T element) {
        if (size == array.length) {
            makeArrayGreateAgain();
        }
        array[size++] = element;
    }

    public T get(int index) {
        find(index);
        return (T) array[index];
    }


    public void remove(int index) {
        find(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    public void addAll(Collection<T> collection) {
        for (T c : collection) {
            this.add(c);
        }
    }

    private void makeArrayGreateAgain() {
        int newSize = array.length * 3 / 2 + 1;
        array = Arrays.copyOf(array, newSize);
    }

    private void find(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс не найден: " + index);
        }
    }

    public void printer() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }


    public static void bubbleSort(List<Integer> list) {
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
                flag = false;
            }
        }
    }
}
