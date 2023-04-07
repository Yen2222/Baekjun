package Code_Up;

import java.util.Scanner;

public class Q_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
            case 2:
            case 12:
                System.out.printf("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.printf("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("fall");
                break;
            default:
                System.out.printf("다름");;
        }
    }
}
