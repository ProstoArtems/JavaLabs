import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Число студентов: ");
        int a = sc.nextInt();

        System.out.print("Кол-во парт: ");
        int b = sc.nextInt();

        int result = ticketSaler(a, b);
        System.out.println("Не хватает столов: " + result);
    }

    public static int ticketSaler(int a, int b) {
        int c = (a+1)/2;
        int d = Math.max(0, c-b);
        return (d);
    }
}