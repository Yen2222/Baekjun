package Coding_Test;

import java.util.*;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> remove = new ArrayList<>();

        int n = sc.nextInt();
        String today = sc.next();
        String privacies[]= new String[n];

        for (int i =0; i<n; i++) {
            privacies[i] = sc.nextLine();
            String pri = type(privacies[i]);
            String month = period(pri);
            String day = setting(privacies[i], month);

            if(compare(day, today)==1)
                remove.add(i+1);
        }
        System.out.println(remove);
    }
    static String type (String pravacies) {
        String pri []= pravacies.split("\\s");
        return pri[pri.length-1];
    }
    static String period (String pri) {
        Map< String, String> map = new HashMap<>();

        String terms[] = {"A 6", "B 12", "C 3"};
        String num="";

        for (int i=0; i<3; i++) {
            String ter [] = terms[i].split("\\s");
            map.put(ter[0], ter[1]);
        }
        switch (pri){
            case "A" : num = map.get("A");
                break;
            case "B" : num = map.get("B");
                break;
            case "C" : num = map.get("C");
                break;
        }
        return num;
    }
    static String setting(String pravacies, String month) {
        String pri [] = pravacies.split("\\s");
        String pra [] = pri[0].split("[.]");

        int mon = Integer.parseInt(pra[1]) + Integer.parseInt(month);
        int year = Integer.parseInt(pra[0]);
        String day = "";
        if(mon>12){
            mon=mon-12;
            year++;
            day = Integer.toString(year) + Integer.toString(mon) + pra[2];
        } else {
            day = pra[0]+ Integer.toString(mon) + pra[2];
        }
        return day;
    }
    static int compare(String day, String today) {
        String days[] = day.split(".");
        String td [] = today.split(".");

        int i=1;
        if(Integer.parseInt(days[0])!=Integer.parseInt(td[0]))
            i=0;
        else if(Integer.parseInt(days[1])!=Integer.parseInt(td[1]))
                i=0;
        else if(Integer.parseInt(days[2])!=Integer.parseInt(td[2]))
                i=0;
        return i;
    }
}
