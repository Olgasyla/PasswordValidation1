import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    public void isPasswordLongEight_thenReturnTrue() {

        //GIVEN
        String password = "password";

        //WHEN
        boolean actuel = PasswordValidation.checkLength(password);

        //THEN
        assertTrue(actuel);
    }

    @Test
    public void isPasswordLessEight_thenReturnFalse() {

        //GIVEN
        String password = "pass";

        //WHEN
        boolean actuel = PasswordValidation.checkLength(password);

        //THEN
        assertFalse(actuel);
    }

    @Test
    public void isPasswordContainsDigit_thenReturnTrue() {

        //GIVEN
        String password = "password1";

        //WHEN
        boolean actuel = PasswordValidation.checkDigit(password);

        //THEN
        assertTrue(actuel);
    }

    @Test
    public void isPasswordContainsUpperCase_thenReturnTrue() {

        //GIVEN
        String password = "Password";

        //WHEN
        boolean actuel = PasswordValidation.checkUpperCase(password);

        //THEN
        assertTrue(actuel);
    }

    @Test
    public void isPasswordContainsLowerCase_thenReturnTrue() {

        //GIVEN
        String password = "Password";

        //WHEN
        boolean actuel = PasswordValidation.checkLowerCase(password);

        //THEN
        assertTrue(actuel);
    }
}
