package Code_Up;

import java.util.Scanner;

public class Q_1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w=sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%3.2f MB",(float)w*h*b/8/1024/1024);
    }
}
