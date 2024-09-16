import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = sc.nextInt();
        int result = factorial(a);
        System.out.println("Факториал числа: " + result);
    }

    public static int factorial(int a) {
        int sum =1;
        for (int i = 1; i <= a; i++) {
            sum = sum*i;
        }
        return (sum);
    }
}