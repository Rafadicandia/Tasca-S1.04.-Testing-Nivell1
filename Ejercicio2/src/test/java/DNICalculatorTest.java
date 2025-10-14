import org.junit.jupiter.params.ParameterizedTest; // ¡Necesitas este import!
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;



class DNICalculatorTest {

//    @Test
//    public void DNILetterTest() {
//        int dni = 32096242;
//        char letter='H';
//        char calculated=DNICalculator.getDNILetter(dni);
//        assertEquals(letter, calculated, "Not Correct");
//    }

    @ParameterizedTest
    @CsvSource({
            "32096242, H",
            "11952101, J",
            "17384737, A",
            "72541408, Y",
            "15523720, P",
            "43016843, N",
            "74493388, E",
            "35851198, V",
            "32812751, P",
            "12950433, F"
    })
    public void DNILetterTest(int dni, char letter){

        char calculated=DNICalculator.getDNILetter(dni);
        assertEquals(letter, calculated, "Not Correct");

    }



}