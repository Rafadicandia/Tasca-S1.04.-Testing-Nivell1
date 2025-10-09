


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDDBB {

    private ArrayList <Book> booksList;

    public BookDDBB(){
        this.booksList=new ArrayList<>();
    }



    public void addBook(Book newBook){
        booksList.add(newBook);
    }

    public List<Book> getAllBooks(){
            return Collections.unmodifiableList(this.booksList);
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

    public int getSize(){
        return booksList.size();
    }



}
