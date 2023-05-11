package Test_major;

import java.util.Scanner;

public class Q_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int rr [] = new int[t];
        String st [] = new String[t];
        for(int i=0; i<t; i++) {
            int r = sc.nextInt();
            rr [i] = r;
            String S = sc.next();
            st [i] = S;
        }
        for(int i=0; i<t; i++) {
            for (int j = 0; j < st[i].length(); j++) {
                for (int k = 0; k < rr[i]; k++) {
                    System.out.print(st[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
