/*Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi
un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.*/

import java.util.List;

public class DNICalculator {

    public static void main(String[] args) {


       getDNILetter(32096242);


    }

static Character getDNILetter(int dni) {

    int verification=dni%23;

    List<Character> lettersDni = List.of(
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    );
System.out.println("Your verification letter is: "+lettersDni.get(verification));
    return lettersDni.get(verification);

}
}
