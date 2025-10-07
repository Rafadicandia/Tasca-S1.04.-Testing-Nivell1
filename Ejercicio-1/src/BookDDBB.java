/*La clase debe permitir añadir libros a la colección.
Se debe poder recuperar la lista completa de libros
Se debe poder obtener el título de un libro dada una posición.
Se debe poder añadir un libro en una posición específica.
Se debe poder eliminar un libro por título.*/


import java.util.ArrayList;
import java.util.ListIterator;

public class BookDDBB {

    private ArrayList <Book> booksList;

    public BookDDBB(){
        this.booksList=new ArrayList<>();
    }

    ListIterator<Book> it1 = booksList.listIterator();

    public void addBook(Book newBook){
        booksList.add(newBook);
    }

    public void getAllBooks(){

        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }

    public String getNameByIndex(int index){
        return booksList.get(index).getName();
    }

    public void addBookByIndex(Book name, int index){
        booksList.add(index, name);
    }

    public void removeBook(Book name){
        booksList.remove(name);
    }



}
