package Code_Up;

import java.util.Scanner;

public class Q_1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa [][] = new int[20][20];
        int bb [] = new int[2];
        int cc [] = new int[2];

        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
               aa[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            bb[i] = sc.nextInt();
            cc[i] = sc.nextInt();
        }

        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
                if(i== bb[0]-1 || i == bb[1]-1 || j== cc[0]-1 || j == cc[1]-1){
                    aa [i][j] --;
                    if(i==bb[0]-1&&j== cc[0]-1 || i == bb[1]-1&&j== cc[0]-1 || i== bb[0]-1&&j == cc[1]-1 || i == bb[1]-1&&j == cc[1]-1)
                        aa[i][j]++;
                }
                System.out.printf("%d ", aa[i][j]);
            }
            System.out.println();
        }
    }
}
