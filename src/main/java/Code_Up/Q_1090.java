package Code_Up;

import java.util.Scanner;

public class Q_1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        double result = Math.pow(r,n-1);
        System.out.print((long)(a*(float)result));
    }
}
