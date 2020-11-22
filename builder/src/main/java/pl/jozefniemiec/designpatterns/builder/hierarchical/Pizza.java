package pl.jozefniemiec.designpatterns.builder.hierarchical;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    private final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {

        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        abstract T self();
    }

    protected Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }
}