//Вывести все простые числа от 1 до 1000 

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int a = 2; a <= 1000; a++) {
            boolean isPrime = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a);
            }
        }
    }
}