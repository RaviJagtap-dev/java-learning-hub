package oop.objectdemo;

public class Car {

    private String model;
    private String color;
    private String compony;
    private int price;

    Car(String model,String color,String compony,int price){
        this.model=model;
        this.color=color;
        this.compony=compony;


    }

        public Car(String maruti8000, String red, String suzuki) {
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
       if (price<0){
           System.out.println("Price cannot be negative");
       }
       this.price = price;
    }

    public void drive() {

    }
    }




