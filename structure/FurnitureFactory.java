package FurnitureShop.structure;
import FurnitureShop.items.Chair;
import FurnitureShop.items.Sofa;
import FurnitureShop.items.CoffeeTable;

public interface FurnitureFactory {
    public Chair createChair();
    public Sofa createSofa();
    public CoffeeTable createCoffeeTable();
}
