package org.example;

public class HotDrink extends Product{

    private int temperature;

    public HotDrink(String name, int price) {
        super(name, price);
    }

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
