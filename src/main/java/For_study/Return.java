package For_study;

import java.util.Scanner;

public class Return {
    static void print (int dan){
        if(!(dan>=2 && dan<=9))
            return;
        //2단 ~ 9단 사이가 아니면, 메서드 종료 후 돌아감
        for(int i=1; i<10; i++){
            System.out.printf("%d X %d = %2d \n",dan,i, dan*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        print(a);
    }
}
