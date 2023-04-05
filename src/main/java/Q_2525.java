import java.util.Scanner;

public class Q_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+c/60>23){
            if(b+(c%60)>=60)
                System.out.printf("%d %d", (a+c/60)-23,(b+(c%60))-60);
            else
                System.out.printf("%d %d", (a+c/60)-24, b+(c%60));
        }
        else {
            if(b+(c%60)>=60) {
                if((a + c / 60) + 1==24){
                    System.out.printf("%d %d", 0, (b + (c % 60)) - 60);
                }else {
                    System.out.printf("%d %d", (a + c / 60) + 1, (b + (c % 60)) - 60);
                }
            }
            else
                System.out.printf("%d %d", a+c/60, b+(c%60));
        }
    }
}
