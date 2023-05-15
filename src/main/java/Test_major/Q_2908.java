package Test_major;

import java.util.Scanner;

public class Q_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A, B;
        A = sc.next();
        B = sc.next();
        String a [] = A.split("");
        String b [] = B.split("");

        String aa = (a[2]+a[1]+a[0]);
        String bb = (b[2]+b[1]+b[0]);

        if(Integer.parseInt(aa)<Integer.parseInt(bb))
            System.out.println(bb);
        else
            System.out.println(aa);
    }
}
