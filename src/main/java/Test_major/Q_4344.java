package Test_major;

import java.util.Scanner;

public class Q_4344 {
    static private Scanner sc = new Scanner(System.in);

    static int ave(int n) {
        int a[] = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        int aver = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (aver < a[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int c = sc.nextInt();
        float aver[] = new float[c];

        for (int i = 0; i < c; i++) {
//            Scanner sc2 = new Scanner(System.in);
            int n = sc.nextInt();
            aver[i] = ave(n) / (float) n * 100;
        }
        for (int i = 0; i < c; i++)
            System.out.printf("%5.3f%%\n", aver[i]);
    }
}
