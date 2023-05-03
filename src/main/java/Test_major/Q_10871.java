package Test_major;

import java.util.Scanner;

public class Q_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aa [] = new int[n];
        int x = sc.nextInt();

        for (int i = 0; i<aa.length; i++){
            aa [i] = sc.nextInt();
        }
        for (int i =0; i<aa.length; i++){
            if(aa [i]<x){
                System.out.printf("%d ",aa [i]);
            }
        }
    }
}
