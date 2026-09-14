package pizza.java;

public class VeganPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VeganPizzaBuilder() {
        this.reset();
    }

    @Override
    public PizzaBuilder reset() {
        this.pizza = new Pizza();
        return this;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.pizza.setSauce(sauce);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        if ("Meat".equalsIgnoreCase(topping) || "Pepperoni".equalsIgnoreCase(topping)) {
            throw new IllegalArgumentException("Vegan pizza cannot contain meat ingredients!");
        }
        this.pizza.addTopping(topping);
        return this;
    }

    @Override
    public Pizza build() {
        if (this.pizza == null) {
            throw new IllegalStateException("Pizza has not been initialized");
        }
        Pizza result = this.pizza;
        this.reset();
        return result;
    }
}
