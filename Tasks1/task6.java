import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество квадратных метров имеющейся ткани: ");
        int a = sc.nextInt();

        System.out.print("Введите длину пододеяльника: ");
        int b = sc.nextInt();

        System.out.print("Введите ширину пододеяльника: ");
        int c = sc.nextInt();

        double result = howManyItems(a, b, c);
        System.out.println("Кол-во пододеяльников: " + result);

    }

    public static double howManyItems(int a, int b, int c) {
        return (a/(2*b*c));
    }
}