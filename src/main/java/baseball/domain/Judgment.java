package baseball.domain;

import java.util.List;

public class Judgment {
    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            int playerNumber = player.get(i);
            player.contains(playerNumber);
            if (computer.contains(playerNumber)) {
                result++; //result = result +1;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeIndex, int number) {
        return computer.get(placeIndex) == number; // 아래와 같은 코드
//        if (computer.get(placeIndex) == number) {// 특정 자리에 있는 숫자를 가지고 올 때
//            return true;
//            }
//        return false;
    }

}
