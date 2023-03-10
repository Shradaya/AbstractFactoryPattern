package FurnitureShop.items;

import FurnitureShop.structure.Furniture;

public class Sofa extends Furniture {
    String value;
    public Sofa(String value){
        this.value = value;
        System.out.println("Sofa Created of " + value);
    }
    public void sit() {
        System.out.println("Sitting on a " + this.value + " sofa.");
    }
    public void lie() {
        System.out.println("Lying on a " + this.value + " sofa.");
    }
    public void place() {
        System.out.println("Placing a " + this.value + " sofa.");
    }
}
