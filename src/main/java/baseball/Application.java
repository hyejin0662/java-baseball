package baseball;

import baseball.exception.ExitOrRestartCheck;
import baseball.exception.NumberCheck;
import baseball.input.Input;
import baseball.number.CompareNum;
import baseball.number.ComputerNumber;
import baseball.run.ExitOrRestart;
import java.util.List;

public class Application {


    public static void main(String[] args) {
        boolean runFlag = true;
        List<Integer> computerNumber;
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (runFlag) {
            computerNumber = ComputerNumber.createNumber();
            String checkMessage = "";
            while (!(checkMessage.equals("3스트라이크"))) {
                System.out.print("숫자를 입력해주세요 : ");
                String userNum = NumberCheck.User(Input.inputValue());
                checkMessage = CompareNum.check(computerNumber, userNum);
                System.out.println(checkMessage);
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String oneOrTwo = Input.inputValue();
            ExitOrRestartCheck.check(oneOrTwo);
            runFlag = ExitOrRestart.oneOrTwo(oneOrTwo);
        }
    }


}
