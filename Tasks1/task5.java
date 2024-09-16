import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        int result = ternaryEvaluation(a, b);
        System.out.println("Большее число: " + result);

    }

    public static int ternaryEvaluation(int a, int b) {
        return (a > b) ? a : b;
    }
}