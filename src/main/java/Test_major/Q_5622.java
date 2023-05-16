package Test_major;

import java.util.Scanner;

public class Q_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        String ss [] = st.split("");
//        int al [] = new int[ss.length];
//        int a = 65;
        int count=0;
        int b=3;
        int c =0;
        int d = 0;

//        for (int i=0; i<26; i++){
//            al[i] = a;
//            a++;
//        }
        for(int i = 0; i< ss.length; i++){
               for(int j=0; j<3; j++){
                   if((int)ss[i].charAt(0)-65 == 18 ) {
                       count += 8;
                       c++;
                       j=0;
                   } else if ((int)ss[i].charAt(0)-65 == 25) {
                       count+=10;
                       break;
                   }
                   else if ((int)ss[i].charAt(0)-65 == c){
                       count += 3+d;
                       c++;
                       if(j==2) {
                           j = 0;
                           d++;
                       }
                    }
               }
        }
        System.out.println(count);
    }
}
