package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

    // Caso 1: valores positivos
    @Test
    void testValoresPositivosConError() {
        Rectangulo r = new Rectangulo(3, 4);

        assertAll(
            () -> assertEquals(999, r.area()),       // ERROR intencionado
            () -> assertEquals(14, r.perimetro())
        );
    }

    // Caso 2: valores negativos
    @Test
    void testValoresNegativosConError() {
        Rectangulo r = new Rectangulo(-3, 4);

        assertAll(
            () -> assertEquals(-1, r.area()),
            () -> assertEquals(100, r.perimetro())   // ERROR intencionado
        );
    }

    // Caso 3: valores cero
    @Test
    void testValoresCeroConError() {
        Rectangulo r = new Rectangulo(0, 4);

        assertAll(
            () -> assertEquals(1, r.area()),         // ERROR intencionado
            () -> assertEquals(0, r.perimetro())
        );
    }
}