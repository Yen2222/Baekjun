package Test_major;

import java.util.Scanner;
public class Q_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = sc.nextInt();
        b = sc.nextInt();

        c = a + b;
        System.out.printf("%d \n", c);

        c = a - b;
        System.out.printf("%d \n", c);

        c = a * b;
        System.out.printf("%d \n", c);

        c = a / b;
        System.out.printf("%d \n", c);

        c = a % b;
        System.out.printf("%d \n", c);
    }
}
