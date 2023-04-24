package Mideterms;

public class diamond {
    public static void main(String[] args) {

        int a = 3, b = 1;
        for(int i=0; i<7; i++){
//            for(int j=0; j<a; j++)
//                System.out.print(" ");
//            for(int j=0; j<b ; j++)
//                System.out.print("*");
            if(i>3) {
                a++;
                b-=2;
            }
            for(int j=0; j<a; j++)
                System.out.print(" ");
            for(int j=0; j<b ; j++)
                System.out.print("*");
            if(i<3) {
                a--;
                b+=2;
            }
            System.out.println("");
        }
    }
}
