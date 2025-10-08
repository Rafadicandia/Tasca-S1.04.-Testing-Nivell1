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

}
