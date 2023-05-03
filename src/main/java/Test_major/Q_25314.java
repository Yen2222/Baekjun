package Test_major;

import java.util.Scanner;

public class Q_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        for ( int i = 1; i <= (a/4); i++){
            System.out.printf("long ");
        }
        System.out.printf("int");
    }
}
