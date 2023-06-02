package For_study;

public class Static_Instance2 {
    // 매서드 사용
    void instanceMethod () {}
    static void staticMethod() {}

    void instanceMethod2 () {
        instanceMethod();
        staticMethod();
    }

    static void staicMethod2 () { // 항상 호출 가능한 메서드
        // instanceMethod ();
        // 변수와 마찬가지로 static 매서드가 인스턴스 메서드 호출 불가능
        // 인스턴스 메서드가 항상 있지 않을 수도 있기 때문
        staticMethod();
    }
}
