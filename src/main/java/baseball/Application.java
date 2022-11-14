package baseball;

import baseball.domain.NumberGenerator;
import baseball.domain.Referee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 객체 지향 프로그래밍 : *  1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다. 2. 필요한 기능을 (역할에 맞는) 각 인스턴스가 수행하게 한다. (의인화) 3. 각 결과를 종합한다. (=> 하나로
 * 프로그램화해서 동작시킨다.)
 */

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();
//        System.out.println(numbers);

//        Judgment judgment = new Judgment();
//        int count = judgment.correctCount(Arrays.asList(7, 8, 9),
//                Arrays.asList(1, 2, 3)); // Arrays.asList => 배열을 리스트로 만드는 방법
//        System.out.println(count); //3

//        final boolean place = judgment.hasPlace(Arrays.asList(7, 8, 9),0,7); // 인덱스 번호 or placeNumber로 설정하고 placeNumber+1 해줘도 됨
//        System.out.println(place); //true                                           // 인덱스의 0번째에 있는 것이 7인지

        Referee referee = new Referee();

        // 0볼 0 스트라이크가 되어야 끝남 -> while문
        String result = "";
        while (!result.equals("0 볼 3 스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result); //3 스트라이크
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static List<Integer> askNumbers() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
