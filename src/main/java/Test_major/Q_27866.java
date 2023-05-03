package Test_major;

import java.util.Scanner;

public class Q_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int i = sc.nextInt();
        String str = S.substring(i-1,i);

        System.out.print(str);
    }
}
