package oop.aggregation;

public class AggregationDemo {
    public static void main(String[] args) {
        //** Aggregation = represent a 'has-a' relationship between an objects
        //                 one object contains another object as part of its structure
        //                 but the contained objects can be exist independently

            Book book1 = new Book("The Seekar of Nothing", 349);
            Book book2 = new Book("Ramayana", 245);
            Book book3 = new Book("Bhagavtgita", 400);
            Book book4 = new Book("Question and answers", 278);

            Book [] books = {book1,book2,book3,book4};

            Library library=new Library("The Swami Vivekanand",1899,books);

           library.displayinfo();
    }
}
