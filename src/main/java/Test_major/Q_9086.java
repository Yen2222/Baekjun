package Test_major;

import java.util.Scanner;

public class Q_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            String st = sc.nextLine();
            String str = st.substring(0,1);
            System.out.print(str);
        }
    }
}
