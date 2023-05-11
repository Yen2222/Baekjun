package Test_major;

import java.util.Scanner;

public class Q_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String ss;
        if(!s.equals(" ")){
            ss = s.trim();
            String str[] = ss.split(" ");
            System.out.println(str.length);
        } else {
            String str[] = s.split(" ");
            System.out.println(str.length);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String sss = sc.nextLine();
//        String s[] = sss.split(" ");
//        int cnt = 0;
//
//        for (int i = 0; i < s.length; i++) {
//            if (s[i].charAt(i) == ' ') {
//                cnt++;
//            }
//        }
//        int sum = sss.length() - cnt;
//        System.out.println(sum);
//    }
}
