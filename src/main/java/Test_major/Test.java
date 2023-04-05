package Test_major;

public class Test {
    public static void main(String[] args) {
        int a=0, i=1;
        int hap = 0;

        while ( i<101){
            if(i<50 || i>59){
                hap += i;
                a = i;
            }
            i++;
        }
        System.out.printf("1부터 100까지 50~59까지의 숫자를 빼고 덧셈한 합계: %d \n",hap);
        System.out.print(a+"번 반복되었습니다");
    }
}
