package Test_major;

import java.util.Scanner;

public class Q_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,i;
        int t = sc.nextInt();

            for ( i = 0; i < t; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.printf("%d \n", a+b);
            }
    }
}
