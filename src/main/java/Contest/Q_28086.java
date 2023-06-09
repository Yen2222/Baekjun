package Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_28086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String polynomial = sc.nextLine();
        StringTokenizer st = new StringTokenizer(polynomial, "\\+|-|\\*|/", true);

        List<String> myList = new ArrayList<>();

        for (; ; ) {
            if (!st.hasMoreTokens())
                break;
            myList.add(st.nextToken());
        }

        System.out.println(myList);


//        switch (nomial2[0].charAt(0)){
//            case '+' :
//                System.out.println(Integer.toOctalString(Integer.parseInt(nomial[0]) + Integer.parseInt(integer)));
//                break;
//            case '-' :
//                System.out.println(Integer.toOctalString(Integer.parseInt(nomial[0]) - Integer.parseInt(integer)));
//                break;
//            case '*' :
//                System.out.println(Integer.toOctalString(Integer.parseInt(nomial[0]) * Integer.parseInt(integer)));
//                break;
//            case '/' :
//                System.out.println(Integer.toOctalString(Integer.parseInt(nomial[0]) / Integer.parseInt(integer)));
//                break;
//            default:
//                System.out.println("invalid");
//                break;
//        }
    }
}
