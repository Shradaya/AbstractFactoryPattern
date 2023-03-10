package FurnitureShop.items;

import FurnitureShop.structure.Furniture;

public class CoffeeTable extends Furniture {
    String value;
    public CoffeeTable(String value){
        this.value = value;
        System.out.println("CoffeeTable Created of " + value);
    }
    public void sit() {
        // Not applicable
    }
    public void lie() {
        // Not applicable
    }
    public void place() {
        System.out.println("Placing a " + this.value + " coffee table.");
    }
}
