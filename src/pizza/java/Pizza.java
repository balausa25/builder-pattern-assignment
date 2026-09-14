package pizza.java;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private final List<String> toppings = new ArrayList<>();

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}