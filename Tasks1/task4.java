import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        String result = triangleType(x, y, z);
        System.out.print("Тип треугольника: " + result);
    }
    public static String triangleType(int x, int y, int z) {
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "не является треугольником";
        }
        if (x == y && y == z && z == x) {
            return "равносторонний";
        } else if (x == y || y == z || x == z) {
            return "равнобедренный";
        } else {
            return "разносторонний";
        }
    }
}
