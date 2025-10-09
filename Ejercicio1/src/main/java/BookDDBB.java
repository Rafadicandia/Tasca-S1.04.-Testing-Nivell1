


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class BookDDBB {

    private ArrayList <Book> booksList;
    private final Comparator<Book> NAME_COMPARATOR = (b1, b2) -> b1.getName().compareToIgnoreCase(b2.getName());

    public BookDDBB(){
        this.booksList=new ArrayList<>();
    }

    public boolean addBook(Book newBook){
        if (booksList.contains(newBook)) {
            return false;
        }else{
            booksList.add(newBook);
        }
        return true;

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
