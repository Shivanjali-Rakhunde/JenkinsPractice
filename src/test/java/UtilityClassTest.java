

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UtilityClassTest {

    @Test
    void testAdd() {
        assertEquals(5, UtilityClass.add(2, 3));
    }

    @Test
    void testSub() {
        assertEquals(1, UtilityClass.sub(3, 2));
    }

    @Test
    void testMul() {
        assertEquals(6, UtilityClass.mul(2, 3));
    }

    @Test
    void testDiv() {
        assertEquals(2, UtilityClass.div(6, 3));
    }

    @Test
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> UtilityClass.div(5, 0));
    }
}
