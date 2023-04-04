import java.util.Scanner;

public class Q_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int N = sc.nextInt();
        int hap = 0;

        for (int i = 1; i<=N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
               hap = hap + (a*b);
        }
        if(X==hap)
            System.out.printf("Yes");
        else
            System.out.printf("No");
        }
    }

