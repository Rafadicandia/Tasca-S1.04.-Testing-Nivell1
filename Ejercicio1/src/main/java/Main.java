public class Main {

    public static void main(String[] args) {

        BookDDBB newDB = new BookDDBB();

        Book book1 = new Book("El libro de los Test");
        Book book2 = new Book("El gran libro de los Test");

        newDB.addBook(book1);
        newDB.addBook(book2);

        newDB.getAllBooks();


    }
}
