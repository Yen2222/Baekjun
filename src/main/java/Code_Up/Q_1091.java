package Code_Up;

import java.util.Scanner;

public class Q_1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 1; i<n; i++){
            a= a*m +d;
        }
        System.out.print(a);
    }
}
