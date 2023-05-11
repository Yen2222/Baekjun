package Test_major;

import java.util.Scanner;

public class Q_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c && a==c)
            System.out.println(10000 + a * 1000);
        else if (a==b || b==c || a==c) {
            if(a==b || a==c)
                System.out.print(1000 + a * 100);
            else
                System.out.print(1000+ 100 *b);
        } else {
            if(a>b && a>c )
                System.out.println(a * 100);
            else if (b>a && b>c)
                System.out.println(b * 100);
            else if (c>a && c>b)
                System.out.println(c * 100);
        }
    }
}
