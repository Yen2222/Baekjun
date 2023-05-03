package Test_major;

import java.util.Scanner;

public class Q_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h>0){
            if(m-45 < 0)
                System.out.printf("%d %d",h-1, 60+(m-45));
            else
                System.out.printf("%d %d", h, m-45);
        }
        else {
            if(m-45 <0)
                System.out.printf("%d %d",23,60+(m-45));
            else
                System.out.printf("%d %d", h, m-45);
        }
    }
}
