package Test_major;

import Mideterms.C;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q_25206 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        Set subject = new HashSet();

        float sum = 0.0F;
        float hap = 0.0F;

        for(int i=0; i <20; i++) {
            subject.add(sc.next());
            float score = sc.nextFloat();
            String hak = sc.next();
            sum += score*major(hak);
            String hakjum[] = hak.split("");
            if(hakjum[0].charAt(0)!='P')
                hap += score;
        }
        System.out.println(sum/hap);
    }
    static float major(String hak) {
        String hakjum[] = hak.split("");
        float t = 0.0F;
        float p =0.0F;

        switch(hakjum[0].charAt(0)) {
            case('A') : t = 4.0F;
                break;

            case('B') : t = 3.0F;
                break;

            case('C') : t = 2.0F;
                break;

            case('D') : t = 1.0F;
                break;
            default : t = 0.0F;
                break;
        }
        if (hakjum.length == 2) {
            if (hakjum[1].charAt(0) == '+')
            p = 0.5F;
        }
        float tscore = t + p;
        return tscore;
    }
}
