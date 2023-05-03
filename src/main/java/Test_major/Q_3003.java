package Test_major;

import java.util.Scanner;

public class Q_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bb[] = {1,1,2,2,2,8};
        int aa[] = new int[6];
        int cc[] = new int[6];
        int cha;

        for(int i=0; i<aa.length; i++){
            aa[i] = sc.nextInt();
        }
        for(int i=0; i<6;i++){
                cha = bb[i]-aa[i];
                cc[i] =cha;
        }
        for(int i=0; i<cc.length;i++){
            System.out.print(cc[i]+" ");
        }
    }
}
