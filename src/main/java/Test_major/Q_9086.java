package Test_major;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            String st = sc.next();
            String [] str = st.split("");
            // split을 하면 일단 char단위로 나뉨
            // 추가로 기준을 넣는다면 그 기준대로 나뉜다
            System.out.print(str[0]);
            System.out.println(str[str.length-1]);
        }
    }
}
