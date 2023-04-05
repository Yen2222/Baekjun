import java.util.Scanner;

public class Q_HW {
    public static void main(String[] args) {

        int hap = 0;
        int i;

        for( i= 1 ; i<=100; i++){
            if(i< 50 || i>59){
                hap += i;
            }
        }
        System.out.printf("1부터 100까지 숫자에서 50 ~ 59까지의 숫자는 빼고 덧셈한 합계 : %d \n", hap);
        System.out.print(i+"번 반복되었습니다");
    }
}
