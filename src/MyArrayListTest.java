import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(4);
        list.add(10);

        System.out.print("Элементы списка list: ");
        list.printer();

        list.remove(1);
        System.out.print("Список list после удаления элементов: ");
        list.printer();

        List<Integer> listNew = new ArrayList<>();
        listNew.add(10);
        listNew.add(50);
        listNew.add(20);

        list.addAll(listNew);
        System.out.print("Список, на основе другого списка: ");
        list.printer();

        MyArrayList.bubbleSort(listNew);
        System.out.print("Отсортированный список listNew: ");
        for (Integer i : listNew) {
            System.out.print(i + " ");
        }


    }
}
