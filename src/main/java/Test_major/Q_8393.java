package Test_major;

import java.util.Scanner;

public class Q_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hap = 0;

        for(int i = 1; i<=a; i++ ){
            hap = hap + i;
        }
        System.out.printf("%d", hap);
    }
}
