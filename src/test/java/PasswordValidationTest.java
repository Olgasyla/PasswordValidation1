import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    public void isPasswordLongEight_thenReturnTrue(){

        //GIVEN
        String password = "password";

        //WHEN
        boolean actuel = PasswordValidation.checkLength(password);

        //THEN
        assertTrue(actuel);
    }
    public void isPasswordLongEight_thenReturnFalse() {

    }
}