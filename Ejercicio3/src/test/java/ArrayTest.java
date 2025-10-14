import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void testArrayIndexOutOfBounds() {

        Class<ArrayIndexOutOfBoundsException> expectedException = ArrayIndexOutOfBoundsException.class;
        assertThrows(expectedException, ()->{Array.getFruit(3);});
        

    }

}