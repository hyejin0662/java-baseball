package baseball.exception;

public class ExitOrRestartCheck {
    public static void check(String inputValue) {
        if (inputValue.equals("1") || inputValue.equals("2")) {

        } else {
            throw new IllegalArgumentException();
        }
    }
}
