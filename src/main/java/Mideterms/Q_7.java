package Mideterms;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

//        int a=2;
//        for(int i=1; i<a; i++){
//            System.out.print("*");
//            if(i==a-1) {
//                System.out.println();
//                if(i==b)
//                    break;
//                a++;
//                i=0;
//            }
//        }
        int j =1;

        for(int i = 1; i<b+1; i++){
            System.out.print("*");
            if(i==j){
                System.out.println();
                if(j==b)
                    break;
                j++;
                i=0;
            }
        }
    }
}
