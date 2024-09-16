import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число коробок: ");
        int n = sc.nextInt();
        System.out.print("Введите число мешков: ");
        int k = sc.nextInt();
        System.out.print("Введите число бочек: ");
        int m = sc.nextInt();
        int result = stash(n, k, m);
        System.out.print("Общее количество товаров на складе: " + result);
    }
    public static int stash(int a, int b, int c) {
        return (a*20+b*50+c*100);
    }
}
