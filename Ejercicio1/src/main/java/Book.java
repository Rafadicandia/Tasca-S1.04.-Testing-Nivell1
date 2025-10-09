import java.util.Objects;

public class Book {
    private String name;

    public Book(String name){

        if (name==(null)){
            throw new IllegalArgumentException("The name of the book can't be null");
        }

        if (name.isBlank()){
            throw new IllegalArgumentException("The name of the book can't be empty");
        }

        this.name=name;
    }

    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        Book other = (Book) obj;


        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}


