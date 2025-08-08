class OlivesTopping extends ToppingDecorator {
    public OlivesTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double getCost() {
        return pizza.getCost() + 15.0;
    }
}
