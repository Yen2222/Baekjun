package Test_major;

import com.sun.deploy.trace.FileTraceListener;

import java.io.*;

public class Q_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt((sc.readLine()));

        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt((sc.readLine()));
            int b = Integer.parseInt((sc.readLine()));
            int c = a + b;
            bw.write(String.valueOf(c) + "\n");
            bw.flush();
        }
        sc.close();
        bw.close();
    }
}
