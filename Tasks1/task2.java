import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время тренировки: ");
        int minut = scanner.nextInt();

        System.out.print("Введите интенсивность: ");
        int intens = scanner.nextInt();

        int result = kkal(minut, intens);
        System.out.println(result);

    }
    public static int kkal(int a, int b) {
        return (a*b);
    }
}