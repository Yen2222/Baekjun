package Mideterms;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class Q_10 {
    public static void main(String[] args) {
        int aa [] = {1,2,3,1,4};

        for(int i =0; i<aa.length; i++){
            for(int j=i+1; j<aa.length; j++){
                if(aa[i]==aa[j]) {
                    if(j!=4)
                    aa[j] = aa[j + 1];
                }
            }
        }
        for(int i=0; i<4;i++){
            System.out.print(aa[i]+" ");
        }
    }
}
