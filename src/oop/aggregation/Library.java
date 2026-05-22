package oop.aggregation;

public class Library {

    private String name;
    private int year;

    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayinfo()
    {
        System.out.println("The Name of oop.aggregation.Library: " + this.name+" and the Year is: " + this.year);
        System.out.println("The Books Of library:");
        for (Book book : books)
        {
            System.out.println(book.displayInfo());

        }
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public Book[] getBooks(){
        return this.books;
    }

}
