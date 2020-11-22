package pl.jozefniemiec.designpatterns.builder.simple;

public class Pizza {

    private final int size;
    private final String dough;
    private final String sauce;
    private final String topping;

    public static class PizzaBuilder {

        private int size;
        private String dough;
        private String sauce;
        private String topping;

        public PizzaBuilder dough(String val) {
            dough = val;
            return this;
        }

        public PizzaBuilder sauce(String val) {
            this.sauce = val;
            return this;
        }

        public PizzaBuilder topping(String val) {
            this.topping = val;
            return this;
        }

        public PizzaBuilder size(int val) {
            this.size = val;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.topping = pizzaBuilder.topping;
    }

    public int getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}
