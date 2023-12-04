package dto;

import com.study.todoPartyTest.entity.CommonTest;
import com.study.todopartytest.user.UserRequestDTO;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UserRequestDtoTest implements CommonTest {

    @DisplayName("유저 요청 DTO 생성")
    @Nested
    class createUserREquestDTO {
        @DisplayName("유저 요청 DTO 생성 성공")
        @Test
        void createUserRequestDTO_success() {
            // given
            UserRequestDTO userRequestDTO = new UserRequestDTO();
            userRequestDTO.setUsername(TEST_USER_NAME);
            userRequestDTO.setPassword(TEST_USER_PASSWORD);

            // when
            Set<ConstraintViolation<UserRequestDTO>> violations = validate(userRequestDTO);

            // then
            assertThat(violations).isEmpty();
        }

        class createUserRequestDTO {

        }
    }
}
