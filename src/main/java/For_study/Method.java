package For_study;

public class Method {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.add(5, 3);
        long result1 = mm.subtract(5L,3L);
        long result2 = mm.multiply(5L,3L);
//        long result3 = mm.divide(5L,3L);
    }
}

class MyMath {
    long add(long a, long b) { //메소드는 클래스 영역에만 정리 가능
        long result = a + b;
        return result;
        //return a+b
    }
    long subtract(long a, long b) { return a-b; }
    long multiply(long a, long b) { return a*b; }
    double divide (double a, double b) {
        return a/b;
    }
}
