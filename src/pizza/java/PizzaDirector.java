package pizza.java;

public class PizzaDirector {
    public void makeMargherita(PizzaBuilder builder) {
        builder.reset()
                .setSize("Medium")
                .setDough("Thin")
                .setSauce("Tomato")
                .addTopping("Mozzarella")
                .addTopping("Basil");
    }

    public void makePepperoni(PizzaBuilder builder) {
        builder.reset()
                .setSize("Large")
                .setDough("Thick")
                .setSauce("Tomato")
                .addTopping("Mozzarella")
                .addTopping("Pepperoni");
    }
}
