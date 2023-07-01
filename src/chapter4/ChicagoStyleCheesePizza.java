package chapter4;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
        dough = "Thick Crust";
        sauce = "PlumTomato";

        toppings.add("Mozzarella cheese");
    }

    void cut() {
        System.out.println("cut square");
    }
}
