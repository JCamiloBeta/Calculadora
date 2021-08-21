import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculadora.add(2, 2));
    }

    @Test
    @DisplayName("Sub two numbers")
    void sub() {
        assertEquals(0, Calculadora.sub(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculadora.multiply(2, 2)),
                () -> assertEquals(-4, Calculadora.multiply(2, -2)),
                () -> assertEquals(4, Calculadora.multiply(-2, -2)),
                () -> assertEquals(0, Calculadora.multiply(1, 0)));
    }

    /*dsdsds*/
}