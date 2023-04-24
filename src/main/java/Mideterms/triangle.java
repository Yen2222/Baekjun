package Mideterms;

public class triangle {
    public static void main(String[] args) {

        int a = 0;
        for(int i=0; i<7; i++){
            System.out.println("*");
            if(i<3)
                a++;
            else
                a--;
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
        }
    }
}
