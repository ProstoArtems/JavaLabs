import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число галлонов: ");
        int a = sc.nextInt();
        double result = gal(a);
        System.out.println(result + " Литров");
    }
    public static double gal(int b) {
        return (b * 3.785);
    }
}