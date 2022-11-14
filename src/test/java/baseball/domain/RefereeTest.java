package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RefereeTest {

    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);
    private Referee referee;
    // 중복관리

    @BeforeEach
        //  매 테스트마다 실행되는 함수 // 여기서 referee 는 서로다른 referee
    void setUp() {
        referee = new Referee();
    }

    @ParameterizedTest //여러가지 경우에 대해 테스트
    @CsvSource({"1,2,3,0 볼 3 스트라이크", "7,8,9,낫싱", "2,3,1,3 볼 0 스트라이크", "1,3,2,2 볼 1 스트라이크"})
    public void compare(int number1, int number2, int number3, String expected) {
        String actual = referee.compare(ANSWER, Arrays.asList(number1, number2, number3));
        assertThat(actual).isEqualTo(expected);
    }
}

    /*
    위의 것으로 테스트 코드 통일
    
    @Test
    void 스트라이크3() {
        String result = referee.compare(ANSWER, Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크"); // 테스트 성공 /  출력하는게 아니라 컴퓨터에게 맞는지 확인하라고 명령
        // assertThat(result).isEqualTo("0 볼 2 스트라이크"); // 테스트 실패

    }

    @Test
    void 낫싱() {
        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("낫싱"); // 테스트 성공 /  출력하는게 아니라 컴퓨터에게 맞는지 확인하라고 명령
        // assertThat(result).isEqualTo("0 볼 2 스트라이크"); // 테스트 실패

    }

    @Test
    void 볼3() {
        String result = referee.compare(ANSWER, Arrays.asList(2, 3, 1));
        assertThat(result).isEqualTo("3 볼 0 스트라이크"); // 테스트 성공 /  출력하는게 아니라 컴퓨터에게 맞는지 확인하라고 명령
        // assertThat(result).isEqualTo("0 볼 2 스트라이크"); // 테스트 실패

    }

    @Test
    void 볼2_스트라이크1() {
        String result = referee.compare(ANSWER, Arrays.asList(1, 3, 2));
        assertThat(result).isEqualTo("2 볼 1 스트라이크"); // 테스트 성공 /  출력하는게 아니라 컴퓨터에게 맞는지 확인하라고 명령
        // assertThat(result).isEqualTo("0 볼 2 스트라이크"); // 테스트 실패

    }


     */