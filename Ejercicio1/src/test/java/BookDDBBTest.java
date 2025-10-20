
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookDDBBTest {

    private BookDDBB bookDDBB;
    private Book book1;
    private Book book2;

    @BeforeEach
    public void setup() {
        bookDDBB = new BookDDBB();
        book1 = new Book("El libro de los Test");
        book2 = new Book("El gran libro de los Test");
    }



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
        Assertions.assertEquals("El libro de los Test", bookDDBB.getNameByIndex(1));
    }

    @Test
    public void bookIsNotDuplicated(){
        bookDDBB.addBook(book1);
        Book duplicatedBook = new Book("El libro de los Test");

        bookDDBB.addBook(duplicatedBook);

        String failmessage = "The duplicate book should have been baned. The proper size of the list should be 1";
        Assertions.assertEquals(1, bookDDBB.getSize(), failmessage);
    }
    @Test
    public void getBookAtSpecificIndex(){
        bookDDBB.addBook(book1);
        bookDDBB.addBook(book2);
        Assertions.assertEquals("El gran libro de los Test", bookDDBB.getNameByIndex(0));
        Assertions.assertEquals("El libro de los Test", bookDDBB.getNameByIndex(1));
    }

    @Test
    public void listStillOrganizedAfterAdding(){
        Book bookA = new Book("Agora");
        Book bookB = new Book("Belgica");
        Book bookC = new Book("California");

        bookDDBB.addBook(bookA);
        bookDDBB.addBook(bookB);
        bookDDBB.addBookByIndex(bookC, 1);

        Assertions.assertEquals("Agora", bookDDBB.getNameByIndex(0));
        Assertions.assertEquals("Belgica", bookDDBB.getNameByIndex(1));
        Assertions.assertEquals("California", bookDDBB.getNameByIndex(2));
    }

    @Test
    public void listDecreasesAfterRemovingElement(){
        Book bookA = new Book("Agora");
        Book bookB = new Book("Belgica");
        Book bookC = new Book("California");

        bookDDBB.addBook(bookA);
        bookDDBB.addBook(bookB);
        bookDDBB.addBook(bookC);
        bookDDBB.removeBook(bookA);

        Assertions.assertEquals(2, bookDDBB.getSize());

    }

    @Test
    public void CheckListStillOrginizedAfterRemovingElement(){

        Book bookA = new Book("Agora");
        Book bookB = new Book("Belgica");
        Book bookC = new Book("California");

        bookDDBB.addBook(bookA);
        bookDDBB.addBook(bookB);
        bookDDBB.addBook(bookC);
        bookDDBB.removeBook(bookB);

        Assertions.assertEquals("Agora", bookDDBB.getNameByIndex(0));
        Assertions.assertEquals("California", bookDDBB.getNameByIndex(1));


    }







}