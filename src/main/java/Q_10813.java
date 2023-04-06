import java.util.Scanner;

public class Q_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int aa [] = new int[a];
        int b = sc.nextInt();

        for(int k =0; k<aa.length ; k++){
            aa [k] = k+1;
        }

        int str ;
        for(int k=0; k<b; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            str = aa [i-1];
            aa [i-1] = aa [j-1];
            aa [j-1] = str;
        }
        for(int k=0; k<aa.length; k++){
            System.out.printf("%d ", aa [k]);
        }
    }
}
