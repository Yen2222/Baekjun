package Code_Up;

import java.util.Scanner;

public class Q_1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<a+1; i++){
            if(i%3!=0){
                System.out.print(i + " ");
            }
        }
    }
}
