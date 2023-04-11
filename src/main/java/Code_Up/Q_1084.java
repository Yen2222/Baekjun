package Code_Up;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int i,j,k;
        int hap = a*b*c;

        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                for(k=0;k<c;k++){
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.write(String.valueOf(hap));
        br.close();
        bw.flush();
    }
}
