package Mideterms;

public class pramid {
    public static void main(String[] args) {
        int a=1;
        for(int i=0; i<a; i++){
            System.out.print("*");
            if(i==a-1){
                a++;
                System.out.println();
                i=-1;
            }
            if(a==6)
                break;
        }
    }
}
