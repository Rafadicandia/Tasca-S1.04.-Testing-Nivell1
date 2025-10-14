
import java.util.List;

public class DNICalculator {


static Character getDNILetter(int dni) {

    int verification=dni%23;

    List<Character> lettersDni = List.of(
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    );
    return lettersDni.get(verification);

}
}
