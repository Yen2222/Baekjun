import java.util.Scanner;

public class Q_2739 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        for (int j= 1; j<10; j++)
            System.out.printf("%d * %d = %d \n", i, j, i*j);
    }
}
