public class Test {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        while (a < 10) {

            while (b < 10) {
                System.out.printf("%d X %d = %d \n", a, b, a * b);
                b++;
            }
            System.out.println("");
            a++;
            b = 1;
        }
    }
}
