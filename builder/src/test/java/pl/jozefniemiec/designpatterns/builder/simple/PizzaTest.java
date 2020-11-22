package pl.jozefniemiec.designpatterns.builder.simple;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import pl.jozefniemiec.designpatterns.builder.simple.Pizza.PizzaBuilder;

class PizzaTest {

    @Test
    void shouldCreateObjectUsingBuilderPattern() {
        // Given
        var size = 29;
        var dough = "thin";
        var sauce = "tomato";
        var topping = "ham";

        // When
        var pizza = new PizzaBuilder()
            .size(size)
            .dough(dough)
            .sauce(sauce)
            .topping(topping)
            .build();

        // Then
        assertThat(pizza).isNotNull();
        assertThat(pizza.getSize()).isEqualTo(size);
        assertThat(pizza.getDough()).isEqualTo(dough);
        assertThat(pizza.getSauce()).isEqualTo(sauce);
        assertThat(pizza.getTopping()).isEqualTo(topping);
    }
}