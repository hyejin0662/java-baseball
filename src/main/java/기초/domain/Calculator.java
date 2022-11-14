package 기초.domain;

public class Calculator {
    public static final int SHARE_BIRTHDAY = 1104; // 상수 (전체 대문자), 클래스변수이면서 공유할 수 있는 값 // 공유는 하지만, 값은 변하지 않음
    public static int shareResult = 0;//클래스 변수 : static 변수로 공유해서 쓰는 값
    // static의 반댓말 : dynamic : 내가만드는 인스턴스마다 값을 복사


    public int result = 0; // 인스턴스(non-static) 변수 : 클래스 내에서 살아있는 변수


    public Calculator() { // 생성자
    }

    public int add(int number1, int number2) { //메소드(인스턴스 메서드) // 기능 (좌항, 우항) // () 에 있는것을 int 로 반환 / return
        result = number1 + number2; // result에 할당
        shareResult = result;
        return result;
    } // 메소드 or 함수 로 불림


}
