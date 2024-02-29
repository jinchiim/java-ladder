package ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;

import ladder.domain.ladder.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StepTest {

    @Test
    @DisplayName("스텝의 상태를 True로 변경하는 테스트")
    void changeStatusTest() {
        Step step = new Step();

        step.build();

        assertThat(step.getBuildStatus()).isTrue();
    }
}
