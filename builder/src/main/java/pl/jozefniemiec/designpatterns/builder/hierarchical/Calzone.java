package pl.jozefniemiec.designpatterns.builder.hierarchical;

public class Calzone extends Pizza {

    private final boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.souseInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean souseInside;

        @Override
        public Pizza build() {
            return new Calzone(this);
        }

        @Override
        Builder self() {
            return this;
        }

        public Builder sauceInside() {
            souseInside = true;
            return this;
        }
    }

    public boolean isSauceInside() {
        return sauceInside;
    }
}
