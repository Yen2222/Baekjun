import java.util.Scanner;

public class Q_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        a = sc.nextInt();
        b = sc.nextInt();

        double result;
        result = a/b;
        System.out.printf("%17.16f", result);
    }
}
