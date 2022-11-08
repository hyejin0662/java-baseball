package baseball.run;

public class ExitOrRestart {
    public static boolean oneOrTwo(String oneOrTwo) {
        if (oneOrTwo.equals("1")) {
            return true;
        } else {
            System.out.println("게임 종료");
            return false;
        }
    }

}
