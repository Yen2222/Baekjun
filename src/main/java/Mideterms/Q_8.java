package Mideterms;

public class Q_8 {
    public static void main(String[] args) {

        int i=2, j=1;

        while(j<10){
            System.out.print(i+"X"+j+"="+(i*j)+"\n");
            j++;
            if(j==10){
                i++;
                j=1;
                System.out.println("");
            }
            if(i==10)
                break;
        }
    }
}
