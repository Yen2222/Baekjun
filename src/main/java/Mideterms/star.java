package Mideterms;

public class star {
    public static void main(String[] args) {
        int a =1, b=1;

        for(int i=0; i<a; i++){
            System.out.print("*");
            if(i==a-1){
                if(b<4) {
                    a++;
                    b++;
                }
                else {
                    a--;
                    b++;
                }
                System.out.println();
                i=-1;
            }
            if(b==8)
                break;
        }
    }
}
