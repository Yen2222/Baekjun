import java.util.Scanner;

public class Q_2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%d\n", a * (b%10));
        System.out.printf("%d\n", a * ((b%100 - b%10)/10));
        System.out.printf("%d\n", a * (b/100));
        System.out.printf("%d\n", a * b);
    }
}
