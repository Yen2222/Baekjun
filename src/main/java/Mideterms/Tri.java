package Mideterms;

public class Tri {
    public static void main(String[] args) {

        int a=1;
        for(int i=0; i<7; i++){
            for (int j=0; j<a; j++) {
                    System.out.print("*");
                }
            System.out.println("");
            if (i < 3) {
                a++;
            }
            else {
                a--;
            }
        }
    }
}
