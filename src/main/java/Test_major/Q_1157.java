package Test_major;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String word = sc.next();
        String wd[] = word.toUpperCase().split("");
        int a=0;
        for (int i=0; i<wd.length; i++){
            list.add(wd[i]);
        }
        list.add("?");
        int count [] = new int[list.size()-1];

        for(int j = 0; j< list.size()-1; j++){
            count[j]=0;
            for (int i = j + 1; i < list.size()-1; i++) {
                if (wd[j].charAt(0) == wd[i].charAt(0)) {
                    count[j]++;
                }
            }
        }
        int max = count[0];
        for (int i=1; i<list.size()-1; i++){
            if(max<count[i]) {
                max = count[i];
                a=i;
            }else if(max==count[i]){
                a= list.size()-1;
            }
        }
        if(wd.length==1)
            System.out.println(list.get(0));
        else
            System.out.println(list.get(a));
//        for(int i=0; i< list.size()-1; i++)
//            System.out.println(count[i]);
//        list.forEach(al -> System.out.println(al));
//        for(int i=0; i< wd.length; i++) {
//            System.out.println(wd[i]);
//        }
    }
}
