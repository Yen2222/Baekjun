package Test_major;

import java.util.Scanner;

public class Q_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa [] = new int[9];
        int max = aa[0];
        int j,b=0;

        for(int i = 0; i<aa.length; i++){
            aa[i] = sc.nextInt();
            }
        for( j =0; j<aa.length; j++){
            if(aa[j]>max){
                max = aa[j];
                b=j+1;
            }
        }
        System.out.printf("%d \n",max);
        System.out.print(b);

    }
}
