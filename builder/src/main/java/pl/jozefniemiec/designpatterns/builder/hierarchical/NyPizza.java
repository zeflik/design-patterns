package pl.jozefniemiec.designpatterns.builder.hierarchical;

public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public Pizza build() {
            return new NyPizza(this);
        }

        @Override
        Builder self() {
            return this;
        }
    }

    public Size getSize() {
        return size;
    }
}
