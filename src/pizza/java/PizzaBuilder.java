package pizza.java;

public interface PizzaBuilder {
    PizzaBuilder reset();
    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}