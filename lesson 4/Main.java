package list_reverse;
import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static <T> LinkedList<T> reverseList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<T>();
        for (T item : list) {
            reversedList.addFirst(item);
        }
        return reversedList;
    }
    
    public static int sum(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Исходный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        LinkedList<Integer> reversedList = reverseList(list);
        System.out.print("\nПеревернутый список: ");
        for (int i : reversedList) {
            System.out.print(i + " ");
        }

        System.out.println("\nСумма элементов списка: " + sum(list));
    }
}
