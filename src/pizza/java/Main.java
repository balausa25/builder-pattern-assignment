package pizza.java;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        PizzaBuilder italianBuilder = new ItalianPizzaBuilder();
        director.makePepperoni(italianBuilder);
        Pizza pepperoniPizza = italianBuilder.build();
        System.out.println("Director-created Pepperoni: " + pepperoniPizza);
        PizzaBuilder veganBuilder = new VeganPizzaBuilder();
        Pizza customVeganPizza = veganBuilder.reset()
                .setSize("Small")
                .setDough("Gluten-Free")
                .setSauce("Pesto")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .build();

        System.out.println("Custom Vegan Pizza: " + customVeganPizza);
    }
}
