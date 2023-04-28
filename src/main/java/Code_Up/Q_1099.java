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
        int k = 1;
        aa[1][1] = 9;
        for (int i = 1; i <9; i++) {
            if (aa[k][i] == 0)
                aa[k][i] = 9;
            else if (aa[k][i] == 1) {
                i -= 2;
                k++;
            } else if (aa[k][i] == 2) {
                aa[k][i] = 9;
                break;
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
