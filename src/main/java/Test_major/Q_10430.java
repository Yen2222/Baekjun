package Test_major;

import java.util.Scanner;

public class Q_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        System.out.printf("%d \n", (A+B)%C);
        System.out.printf("%d \n", ((A%C)+(B%C))%C);
        System.out.printf("%d \n", (A*B)%C);
        System.out.printf("%d \n", ((A%C)*(B%C))%C);
    }
}