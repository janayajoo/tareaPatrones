package problema3;

import problema3.ingredients.Cheese;
import problema3.ingredients.Ham;
import problema3.ingredients.Mushroom;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder pb = new PizzaBuilder();

        pb.setSize(Size.LARGE);
        pb.setCrust(Crust.THIN);

        pb.addCheese(new Cheese(2));
        pb.addHam(new Ham(1));
        pb.addMushrooms(new Mushroom(2));

        pb.getPizza();
        pb.getFinalCost();

    }
}
