package 기초;

import 기초.domain.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator teacher = new Calculator(); // 인스턴스화 하다.
        // teacher.add(1,3);
        System.out.println(teacher.add(1,3));
        //System.out.println(teacher.result);
        System.out.println(teacher.shareResult);

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2000,21));
        //System.out.println(calculator.result);
        System.out.println(calculator.shareResult);

//        System.out.println(teacher.result); // 4
//        System.out.println(calculator.result); // 2021
        System.out.println(teacher.shareResult); //2021

        System.out.println(Calculator.shareResult);
        // static 변수는 클래스에서 바로 접근가능. 인스턴스변수를 호출하지 않아도됨

        System.out.println(Calculator.SHARE_BIRTHDAY);

    }

}
