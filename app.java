package FurnitureShop;
import FurnitureShop.Order;
import FurnitureShop.factory.*;

public class app {
    public static void main(String[] args) {
        ModernFurnitureFactory Modern = new ModernFurnitureFactory();
        Order ModernOrder = new Order(Modern);
        ModernOrder.orderFurniture();
        System.out.println("------------------------------------------------------------");
        VictorianFurnitureFactory Victorian = new VictorianFurnitureFactory();
        Order vicOrder = new Order(Victorian);
        vicOrder.orderFurniture();
        System.out.println("------------------------------------------------------------");
        ArtDecorFurnitureFactory ArtDecor = new ArtDecorFurnitureFactory();
        Order ArtDecorOrder = new Order(ArtDecor);
        ArtDecorOrder.orderFurniture();
    }
}