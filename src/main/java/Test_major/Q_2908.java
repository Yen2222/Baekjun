package Test_major;

import java.util.Scanner;

public class Q_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String A,B;
       while (true){
             A = sc.next();
             for (int i = 0; i < 3; i++) {
                 if (A.charAt(i) == 0) {
                     A = sc.next();
                     i=0;
                 }
                 else if(A.charAt(2) != 0)
                     break;
             }
           B = sc.next();
           for (int i = 0; i < 3; i++) {
               if (B.charAt(i) == 0) {
                   B = sc.next();
                   i=0;
               }
               if(A.equals(B)) {
                   B = sc.next();
                   i=0;
               }
               else if(B.charAt(2) != 0)
                   break;
           }
           break;
       }

       if (A.charAt(2) > B.charAt(2)) {
           for (int i = 3; i > 0; i--) {
               System.out.print(A.charAt(i - 1));
           }
       } else if(A.charAt(1) > B.charAt(1)){
           for (int i = 3; i > 0; i--) {
               System.out.print(A.charAt(i - 1));
           }
       } else if(A.charAt(0) > B.charAt(0)){
           for (int i = 3; i > 0; i--) {
               System.out.print(A.charAt(i - 1));
           }
       } else {
           for (int i = 3; i > 0; i--) {
               System.out.print(B.charAt(i - 1));
           }
       }
    }
}
