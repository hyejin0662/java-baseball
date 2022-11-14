package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public List<Integer> createRandomNumbers() {
        // 3개의 숫자가 담길 때까지 -> for문으로 해결x while
        //만약 이미 존재하는 숫자라면 담지 않는다.
        //만약 존재하지 않는 숫자라면 담는다.

        List<Integer> numbers = new ArrayList<>();
        // ArrayList 는 앞의 List의 실제 클래스

        while (numbers.size() < 3) {
            int number = new Random().nextInt(9) + 1; //nextInt : 숫자 뽑아내기 bound : 0부터 n-1까지(exclusive n) // 9 +1로해야 1~9
            if (numbers.contains(number)) { // 내가 뽑은 number 를 가지고 있다면 무시
                continue;
            } else {
                numbers.add(number);
            }
        }
        return numbers;
    }
}
