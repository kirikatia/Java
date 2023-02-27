// Реализовать простой калькулятор

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: "); 
        Double a = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("Введите второе число: ");
        Double b = scanner.nextDouble();
        

        double result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Ошибка: неверная операция");
                return;
        }
        
        System.out.println("Результат: " + result);
    }
}
