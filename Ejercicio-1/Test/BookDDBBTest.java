import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookDDBBTest {

    // 1. Declaración de instancias (sin inicializar)
    private BookDDBB bookDDBB; // Usamos nombres más genéricos
    private Book book1;
    private Book book2;

    @BeforeEach
    public void setup() {
        // 2. Inicialización en el método setup()
        // ¡Se ejecuta antes de CADA método @Test!
        bookDDBB = new BookDDBB();
        book1 = new Book("El libro de los Test");
        book2 = new Book("El gran libro de los Test");
    }

    // Aquí irán todos tus métodos @Test

    @Test
            public void listIsNotNull(){
        Assertions.assertNotNull(bookDDBB);
    }

}