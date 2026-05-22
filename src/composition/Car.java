package composition;

public class Car {

    String model;
    int year;
    Engine engine;

    Car(String model,int year, String engineType) {

        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void start() {

        this.engine.start();
        System.out.println("The "+this.model+" is started");
    }
}