package Mideterms;

import java.util.Scanner;

public class min_max_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa [] = new int[5];
        int sum =0 ;

        for(int i=0; i<aa.length; i++){
            aa[i] = sc.nextInt();
        }
        int max=  aa[0], min = aa[0];

        for(int i=0; i<aa.length;i++){
            if(max<aa[i])
                max = aa[i];
            else if (min > aa[i])
                min = aa[i];
            sum += aa[i];
        }
        System.out.printf("가장 큰 값 : %d/ 가장 작은 값 : %d / 평균 값 : %d", max, min, sum/5);
    }
}
