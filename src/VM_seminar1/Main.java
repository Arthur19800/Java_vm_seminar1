package VM_seminar1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------- ВЫБОР ГОРЯЧИХ НАПИТКОВ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrinks("Tea", new BigDecimal(1), 0.4, 80),
                new HotDrinks("Milk", new BigDecimal(3), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Выбор по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Выбор по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Выбор по температуре <=: " + vmHotDrinks.getProduct(70));
    }
}
