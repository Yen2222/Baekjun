package For_study;

public class Static_Instance {
    int iv; // 인스턴스 변수 선언
    static int cv; // 클래스 변수 선언 ( 공통적 -> static 붙임 )

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staicMethod() {
        // System.out.println(iv);
        // 에러남 -> static은 객체를 생성하지 않는 변수만 사용 가능
        System.out.println(cv); // 클래스 변수는 어디는 사용 가능
    }
}
