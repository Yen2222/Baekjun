package Code_Up;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));

        int hap =0;
        int a = Integer.parseInt(bw.readLine());

        for(int i=1; ;i++){
                hap+=i;
            if(hap>=a)
                break;
        }
        System.out.print(hap);
    }
}
