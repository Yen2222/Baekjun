package Mideterms;

public class diamond1 {
    public static void main(String[] args) {

        for(int i =1; i<8; i++){
            if(i<5) {
                for (int j = 0; j < 4-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < (i * 2); j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j =0; j<(i-4); j++){
                    System.out.print(" ");
                }
                for(int j = 0; j < 5-2*(i-5); j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
