package For_study;
class Tv { // Tv 객체의 설개도 (클래스)
    String color; //변수 색깔
    boolean power; // 변수 전원
    int channel; // 변수 채널

    void power() { power = !power; } // 전원 관련 메소드
    void channelUp()  { ++channel; } // 채널 올리는 메소드
    void channelDown ()  { --channel; } // 채널 내리는 메소드
}
public class Object {
    public static void main(String[] args) { //실제 객체를 사용 할 수 있음
        Tv t; // Tv인스턴스 사용 위한 참조 변수를 선언
        t = new Tv(); // 객체 생성 (생성자)
        t.channel = 7; //객체 사용 -> 체널 바꾸기
        t.channelDown(); //객체 사용 -> 채널 내리기
        System.out.println("현재 채널은 "+ t.channel + " 입니다.");
    }
}
