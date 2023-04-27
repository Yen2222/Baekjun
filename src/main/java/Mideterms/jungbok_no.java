package Mideterms;

import java.util.Scanner;

public class jungbok_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa [] = new int [5];

        for(int i=0; i<aa.length; i++){
            aa [i] = sc.nextInt();
        }
        int x = aa.length;
        for(int i=0; i<x;i++){
            for(int j = i+1; j<x; j++){
                if(aa[i]==aa[j]){
                    for(int k = j+1; k<aa.length; k++){
                        aa[k-1] = aa[k];
                    }
                    x--;
                    i=0;
                    j=0;
                }
            }
        }
        int bb [] = new int [x];
        for(int i=0; i<x; i++){
            bb[i] = aa[i];
        }
        System.out.print("저장된 값은 ");
        for(int i=0; i<x-1; i++){
            System.out.print(bb[i]+",");
        }
        System.out.print(bb[x-1]+"입니다.");
    }
}
