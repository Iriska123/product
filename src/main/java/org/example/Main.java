package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    List<Product> products = initProducts();

    BottleOfWaterVendingMachine bottleOfWaterVendingMachine = new BottleOfWaterVendingMachine(products);
    System.out.println(bottleOfWaterVendingMachine.getProduct("Sprite", 75));

    HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);
    System.out.println(bottleOfWaterVendingMachine.getProduct("Tea", 60));



    }
    private static List<Product> initProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("Sprite", 100, 75));
        products.add(new BottleOfWater("Cola", 150));
        products.add(new HotDrink("Coffee", 200));
        products.add(new HotDrink("Tea", 90, 60));
        return products;
    }
}