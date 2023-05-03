package Test_major;

import java.util.Scanner;

public class Q_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int aa[]=new int[n];
        int hap=0,a;

        for(int i=0; i<n; i++){
            aa[i] = sc.nextInt();
        }
        int max = aa[0];

        for(int i=0; i<aa.length; i++){
            if(max<aa[i])
                max = aa[i];
        }
        for(int i=0; i<aa.length; i++){
            hap += (float)aa[i]/max*100;
        }
        System.out.printf("%f", (float)hap/n);
    }
}
