package oop.getterssetters;

public class Car {
    private String model;
    private String color;
    private String compony;
    private int price;

    public Car(String model,String color,String compony,int price){
        this.model=model;
        this.color=color;
        this.compony=compony;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCompony() {
        return compony;
    }
    public void setCompony(String compony) {
        this.compony = compony;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}
