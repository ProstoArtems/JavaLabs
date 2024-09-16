import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double commission = 0.28;
        System.out.print("Введите 1-е число: ");
        int a = sc.nextInt();

        System.out.print("Введите 2-е число: ");
        int b = sc.nextInt();

        double result = ticketSaler(a, b, commission);
        System.out.println("Наибольший общий делитель чисел: " + result);
    }

    public static double ticketSaler(int a, int b, double c) {
        double max =a*b-(a*b*c);
        return (max);
    }
}