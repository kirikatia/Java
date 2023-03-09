import java.util.ArrayList;
import java.util.Collections;

public class MinMaxAvg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.print("Исходный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        
        // Находим минимальное значение списка
        int min = Collections.min(list);
    
        // Находим максимальное значение списка
        int max = Collections.max(list);
    
        // Находим среднее арифметическое значение списка
        int sum = 0;
        int count = list.size();
        for (int i : list){
            sum += i;
        }
        double average = (double) sum / count;

        // Выводим результат
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}