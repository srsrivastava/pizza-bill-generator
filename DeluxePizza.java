public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        addExtraCheese();
        addExtraToppings();
    }
}