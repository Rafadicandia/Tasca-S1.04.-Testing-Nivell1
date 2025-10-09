/*Verifica su correcto funcionamiento con JUnit:

Verifican que la lista de libros no es nula después de crear un objeto nuevo.done
Confirman que la lista tiene un tamaño esperado después de insertar varios libros. done
Aseguran que la lista contiene un libro específico en su correcta posición. done
Verifican que no existen títulos de libros duplicados en la lista.
Comprueban que se puede recuperar el título de un libro dada una posición específica.
Aseguran que añadir un libro modifica correctamente la lista.
Confirman que eliminar un libro disminuye el tamaño de la lista.
Verifican que la lista permanece ordenada alfabéticamente después de añadir o eliminar un libro.*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookDDBBTest {


    private BookDDBB bookDDBB; // Usamos nombres más genéricos
    private Book book1;
    private Book book2;

    @BeforeEach
    public void setup() {

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

    @Test
    public void bookIsAtCorrectPosition(){
        bookDDBB.addBook(book1);
        bookDDBB.addBook(book2);
        bookDDBB.getNameByIndex(1);
        Assertions.assertEquals("El gran libro de los Test", bookDDBB.getNameByIndex(1));
    }





}