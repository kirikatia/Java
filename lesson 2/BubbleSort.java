import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, 9, 1, 5, 6};

    BufferedWriter writer;
    try {
        writer = new BufferedWriter(new FileWriter("log.txt"));
    } catch (IOException e) {
        System.out.println("Ошибка при открытии лог-файла: " + e.getMessage());
        return;
    }

    try {
      writer.write("Исходный массив: " + Arrays.toString(arr));
      writer.newLine();
    } catch (IOException e) {
      System.out.println("Ошибка записи в файл: " + e.getMessage());
    }

    int n = arr.length;
    for (int i = 0; i < n - 1; i++) 
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // Меняем элементы местами
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

            try {
                // Записываем промежуточный результат в файл
                writer.write("После " + (i + 1) + "-й итерации: " + Arrays.toString(arr));
                writer.newLine();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            }
        }
    }

    try{
      writer.write("Отсортированный массив: " + Arrays.toString(arr));
      writer.close();
    } catch (IOException e) {
      System.out.println("Ошибка записи в файл: " + e.getMessage());
    }

    return;
  }
}
