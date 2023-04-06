package Test_major;

import java.util.Scanner;

public class Q_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aa [] = new int[a]; //배열 칸 개수 a개

        for(int i =0; i<aa.length; i++){ //배열 칸 개수 만큼
            aa [i] = sc.nextInt(); // 배열 칸에 입력값을 넣음.
        }

        int v = sc.nextInt(); // v의 값 넣음
        int count = 0; // v랑 같은 수가 몇 개인지 셀 변수 선언

       for( int i = 0; i<aa.length; i++){ // 배열 칸 개수만큼
           if(aa[i]==v){ // 조건과 비교
               count++;
           }
       }
        System.out.printf("%d",count);
    }
}
