import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    private final  NameValidator check = new NameValidator();

    @Test
    @DisplayName("if name equals to null return false")
    void testNullName() {
        assertFalse(check.isValid(null));
    }

    @Test
    void testTooShort(){
        assertFalse(check.isValid("qw"));
    }

    @Test
    void testTooLong(){
        assertFalse(check.isValid("eqeqrrgagajjhsggs1111")); // > 12
    }

    @Test
    void testUserName(){
        assertTrue(check.isValid("usersec1"));
        assertTrue(check.isValid("ryan22"));
    }

    @Test
    void invalidChars(){
        assertFalse(check.isValid("#_weras"));
        assertFalse(check.isValid("_abwe!"));
    }

    @Test
    void rightChars(){
        assertTrue(check.isValid("abc_abc"));
        assertTrue(check.isValid("ABC$"));
    }
}
