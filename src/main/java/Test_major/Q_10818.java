package Test_major;

import java.util.Scanner;

public class Q_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int aa [] = new int[a];

        for(int i = 0; i<aa.length; i++){
            aa [i] = sc.nextInt();
        }
        int max=aa[0], min=aa[0];
        for(int i =0; i<aa.length; i++){
                if (aa[i] > max)
                    max = aa[i];
                if (aa[i] < min)
                    min = aa[i];
        }
        System.out.printf("%d %d",min, max);
    }
}
