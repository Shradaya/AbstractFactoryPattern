package FurnitureShop.factory;
import FurnitureShop.items.Chair;
import FurnitureShop.items.Sofa;
import FurnitureShop.structure.FurnitureFactory;
import FurnitureShop.items.CoffeeTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    String value = "Victorian";
    public Chair createChair() {
        return new Chair(value);
    }
    public Sofa createSofa() {
        return new Sofa(value);
    }
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable(value);
    }
}

