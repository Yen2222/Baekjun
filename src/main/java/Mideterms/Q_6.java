package Mideterms;

public class Q_6 {
    public static void main(String[] args) {

        int i=2;
        for(int j=1; j<10; j++){
            System.out.println(i+"X"+j+"="+(i*j));
            if(j==9){
                j=0;
                i++;
                System.out.println();
            }
            if(i==10)
                break;
        }
    }
}
