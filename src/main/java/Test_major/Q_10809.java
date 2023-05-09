package Test_major;

import java.util.Scanner;

public class Q_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] arr = S.split("");
        char c[] = new char[26];
        int ch[] = new int[26];
        char al = 'a';

        for(int i=0; i<26; i++){
            c[i] = al;
            al++;
            ch[i]=-1;
        }
        for (int i = 0; i < 26; i++) {
            for(int j=0; j< arr.length; j++) {
                if (c[i] == arr[j].charAt(0)) {
                    ch[i] = j;
                    break;
                }
            }
        }
        for(int i=0; i<26; i++) {
            System.out.print(ch[i]+" ");
        }
    }
}
