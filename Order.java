package FurnitureShop;
import FurnitureShop.items.Chair;
import FurnitureShop.items.Sofa;
import FurnitureShop.structure.FurnitureFactory;
import FurnitureShop.items.CoffeeTable;

public class Order {
    private FurnitureFactory factory;
    public Order(FurnitureFactory factory) {
        this.factory = factory;
    }
    public void orderFurniture() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        System.out.println("-------- ARTIFACTS CREATED --------");
        chair.sit();
        sofa.lie();
        coffeeTable.place();
    }
}

