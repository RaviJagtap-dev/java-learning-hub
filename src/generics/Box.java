package generics;

public class Box <T,U>{
    private T item;
    private U price;
    public Box(T item, U price){
        this.item = item;
        this.price = price;

    }
    public T getItem() {
        return item;

    }

    public U getPrice() {
        return price;
    }
    public void setItem(T item) {
        this.item = item;
    }
    public void setPrice(U price) {
        this.price = price;

    }
}
