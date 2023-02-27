// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Triangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        // Вычисляем n-ое треугольное число - сумма чисел от 1 до n
        int triangularNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        System.out.println("n-ое треугольное число: " + triangularNumber);

        // Вычисляем n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! = " + factorial);
    }
}