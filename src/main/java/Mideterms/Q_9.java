package Mideterms;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa [] = new int[5];
        int str;

        for(int i = 0; i<aa.length; i++){
            aa[i] = sc.nextInt();
        }
        for(int i=0; i<aa.length; i++){
            for(int j= i+1; j<aa.length; j++){
                if (aa[i]==aa[j]) {
                    System.out.print("중복 값이 있으므로 종료됩니다");
                    return;
                }
            }
        }
        for(int i = 0; i<aa.length; i++){
            for(int j = 0; j<aa.length; j++){
                if(aa[i]<aa[j]) {
                str = aa[i];
                aa[i] = aa[j];
                aa[j] = str;
                }
            }
        }
        for(int i=0; i<aa. length; i++) {
            System.out.print(aa[i]+" ");
        }
    }
}
