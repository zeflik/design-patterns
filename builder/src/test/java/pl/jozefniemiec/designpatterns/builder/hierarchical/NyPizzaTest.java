package pl.jozefniemiec.designpatterns.builder.hierarchical;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;
import pl.jozefniemiec.designpatterns.builder.hierarchical.NyPizza.Builder;
import pl.jozefniemiec.designpatterns.builder.hierarchical.NyPizza.Size;
import pl.jozefniemiec.designpatterns.builder.hierarchical.Pizza.Topping;

class NyPizzaTest {

    @Test
    void shouldContainProperToppings_whenCreatedUsingBuilder() {
        var pizza = new Builder(Size.LARGE)
            .addTopping(Topping.HAM)
            .addTopping(Topping.MUSHROOM)
            .build();

        assertThat(pizza.getToppings())
            .containsExactlyInAnyOrder(Topping.HAM, Topping.MUSHROOM);
    }

    @Test
    void shouldHaveProperSize_whenCreatedUsingBuilder() {
        var pizza = new Builder(Size.LARGE)
            .addTopping(Topping.HAM)
            .addTopping(Topping.MUSHROOM)
            .build();

        assertThat(pizza).isInstanceOf(NyPizza.class);
        var nyPizza = (NyPizza) pizza;
        assertThat(nyPizza.getSize())
            .isEqualTo(Size.LARGE);
    }
}