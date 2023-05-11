package Test_major;

import java.util.Scanner;

public class Q_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String st [] = a.split("");
        int al=1;

        for(int i=0; i<st.length/2; i++){
            if(st[i].charAt(0) != st[st.length-1-i].charAt(0)) {
                al = 0;
                break;
            }
        }
        System.out.println(al);
    }
}
