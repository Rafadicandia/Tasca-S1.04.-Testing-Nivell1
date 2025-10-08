/*Verifica su correcto funcionamiento con JUnit:

Verifican que la lista de libros no es nula después de crear un objeto nuevo.done
Confirman que la lista tiene un tamaño esperado después de insertar varios libros.
Aseguran que la lista contiene un libro específico en su correcta posición.
Verifican que no existen títulos de libros duplicados en la lista.
Comprueban que se puede recuperar el título de un libro dada una posición específica.
Aseguran que añadir un libro modifica correctamente la lista.
Confirman que eliminar un libro disminuye el tamaño de la lista.
Verifican que la lista permanece ordenada alfabéticamente después de añadir o eliminar un libro.*/

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

    @Test
    public void listSizeIsCorrect(){
        bookDDBB.addBook(book1);
        bookDDBB.addBook(book2);
        Assertions.assertEquals(2, bookDDBB.getSize());

    }

}