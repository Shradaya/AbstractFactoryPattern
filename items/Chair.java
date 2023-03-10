package FurnitureShop.items;

import FurnitureShop.structure.Furniture;

public class Chair extends Furniture {
    String value;
    public Chair(String value){
        this.value = value;
        System.out.println(value + " Chair Created");
    }
    public void sit() {
        System.out.println("Sitting on a " + this.value + " chair.");
    }
    public void lie() {
        //
    }
    public void place() {
        System.out.println("Placing a " + this.value + " chair.");
    }
}