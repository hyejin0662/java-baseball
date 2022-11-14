package baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        // 몇 개의 숫자가 같은지 알아낸 뒤(Judgement 가 협력한다.)
        // 스트라이크의 개수를 구해 뺀다. -> 볼의 갯수
        // 남은 수는 볼의 개수이다.
        Judgment judgement = new Judgment();
        int correctCount = judgement.correctCount(computer, player); // 몇 개의 숫자가 같은지

        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
            if (judgement.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike++;
        }
    }
    int ball = correctCount - strike;
//        if (ball != 0) {
//
//        }

        return ball + " 볼 " + strike + " 스트라이크";
    }


}
