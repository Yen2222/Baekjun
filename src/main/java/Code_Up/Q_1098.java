package Code_Up;

import java.util.Scanner;

public class Q_1098 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int aa [][] = new int[w][h];
        int n = sc.nextInt();
        int l[] = new int[n];
        int d[] = new int[n];
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i = 0; i<n; i++){
            l[i] = sc.nextInt();
            d[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 0; i<aa.length; i++){
            for(int j =0; j<aa.length; j++){
                for(int k=0; k<n; k++) {
                    if (i == x[k] - 1 && j == y[k] - 1){
                        if(d[k]==0){
                            for(int m=0; m<l[k];m++){
                                aa[i][j+m]++;
                            }
                        }
                        if(d[k]==1){
                            for(int m=0; m<l[k]; m++){
                                aa[i+m][j]++;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i<aa.length; i++){
            for(int j =0; j<aa.length; j++){
                System.out.printf("%d ", aa[i][j]);
            }
            System.out.println();
        }
    }
}
