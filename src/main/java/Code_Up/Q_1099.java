package Code_Up;

import java.util.Scanner;

public class Q_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa[][] = new int[10][10];
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                aa[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j <aa.length; j++) {
                if (aa[i][j] == 0) {
                    aa[i][j] = 9;
                }
                if (aa[i][j] == 1) {
                    i++;
                }
            }

        }

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                System.out.printf("%d ", aa[i][j]);
            }
            System.out.println();
        }
    }
}
