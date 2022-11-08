package baseball.exception;

import java.util.HashSet;
import java.util.Set;

public class NumberCheck {
    public static String User(String userNum) {
        if (userNum.length() != 3) {
            throw new IllegalArgumentException();
        }
        char[] userNumCharArr = userNum.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character x : userNumCharArr) {
            if (!Character.isDigit(x)) {
                throw new IllegalArgumentException();
            }
            if (x == '0') {
                throw new IllegalArgumentException();
            }
            set.add(x);
        }
        if (userNumCharArr.length != set.size()) {
            throw new IllegalArgumentException();
        }
        return userNum;
    }
}
