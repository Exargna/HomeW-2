import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Логическое И = &&
        // Логическое ИЛИ = ||
        //     &&                    ||
        // true  true = true     true  true = true
        // false  true = false   true  false = true
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        if (a > 5 && b < 5) {
            System.out.println("Первая переменная > второй");
        }
        if (a < 5 && b > 5) {
            System.out.println("Вторая переменная > первой");
        }
    }
}