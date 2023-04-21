package Code_Up;

public class For {
    public static void main(String[] args) {

        int j = 2;
        for(int i =1; i<10; i++){
            System.out.println( j + "X" + i + "=" + j*i);
            if(i==9){
                i=1;
                j++;
                System.out.println("");
            }
            if(j==10)
                break;
        }
    }
}
