package Test_major;

import java.util.Scanner;

public class Q_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String st ;
        int count=0;
        for(int i=0; i<a; i++) {
            st = sc.next();
            String str[] = st.split("");
            for(int k =0; k< str.length; k++) {
                int j=k+1;
                if (str[k].charAt(0)!=str[j].charAt(0)){
                    j++;
                    if(j== str.length) {
                        count++;
                        break;
                    }
                    if(str[k].charAt(0)==str[j].charAt(0))
                        break;
                } else {
                    j++;
                    if(j== str.length) {
                        count++;
                        break;
                    }
                    if(str[k].charAt(0)==str[j].charAt(0))
                        break;
                }
            }
        }
        System.out.println(count);
    }
}
