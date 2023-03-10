package FurnitureShop.factory;
import FurnitureShop.items.Chair;
import FurnitureShop.items.Sofa;
import FurnitureShop.structure.FurnitureFactory;
import FurnitureShop.items.CoffeeTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    String value = "Modern";
    public Chair createChair() {
        return new Chair(this.value);
    }
    public Sofa createSofa() {
        return new Sofa(this.value);
    }
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable(this.value);
    }
}
