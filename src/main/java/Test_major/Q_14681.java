package Test_major;

import java.util.Scanner;

public class Q_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>0 && y>0)
            System.out.printf("1");
        if (x<0 && y>0)
            System.out.printf("2");
        if (x<0 && y<0)
            System.out.printf("3");
        if (x>0 && y<0)
            System.out.printf("4");
    }
}
