import java.util.ArrayList;

public class RemoveEven {
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
        
        // Удаляем четные числа из списка
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.print("\nНечетные числа: ");
        // Выводим результат
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
