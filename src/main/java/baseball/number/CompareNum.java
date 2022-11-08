package baseball.number;

import java.util.List;

public class CompareNum {


    public static String check(List<Integer> computerNum, String userNum) {
        String computerNumStr = "";
        for (Integer x : computerNum) {
            computerNumStr += x.toString();
        }
        char[] computerNumCharArr = computerNumStr.toCharArray();
        char[] userNumCharArr = userNum.toCharArray();
        int ballCnt = 0;
        int strikeCnt = 0;
        for (int i = 0; i < 3; i++) {
            if (computerNumStr.contains(userNumCharArr[i] + "")) {
                ballCnt++;
            }
            if (computerNumCharArr[i] == userNumCharArr[i]) {
                strikeCnt++;
            }
        }
        if (ballCnt == 0 && strikeCnt == 0) {
            return "낫싱";
        } else if (ballCnt - strikeCnt == 0) {
            return strikeCnt + "스트라이크";
        } else if (strikeCnt == 0) {
            return ballCnt + "볼";
        }
        return ballCnt - strikeCnt + "볼 " + strikeCnt + "스트라이크";
    }
}
