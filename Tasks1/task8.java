import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите 1-е число: ");
        int a = sc.nextInt();

        System.out.print("Введите 2-е число: ");
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println("Наибольший общий делитель чисел: " + result);
    }

    public static int gcd(int a, int b) {
        int max =1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        return (max);
    }
}