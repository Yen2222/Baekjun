package Test_major;

import java.util.Scanner;

public class Q_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        String arr [] = a.split("");
        int hap=0, in;

        for(int i=0; i<n; i++){
            in = Integer.parseInt(arr[i]);
            hap += in;
        }
        System.out.print(hap);
    }
}
