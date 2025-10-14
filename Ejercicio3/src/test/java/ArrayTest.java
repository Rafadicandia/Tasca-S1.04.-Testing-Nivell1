import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void testArrayIndexOutOfBounds() {

        // 1. Especifica el TIPO de excepción que esperas:
        Class<ArrayIndexOutOfBoundsException> expectedException = ArrayIndexOutOfBoundsException.class;

        // 2. Llama a assertThrows, pasándole la excepción esperada y la LÓGICA que la provoca.

        // ¿Cómo llamarías a assertThrows usando una expresión lambda (->) para ejecutar ArrayHandler.getFruit()?

        // assertThrows( expectedException, () -> { /* TU CÓDIGO AQUÍ */ } );

    }

}