class NYPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza {
        lateinit var pizza: Pizza
        val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

        when (item) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "New York Style Cheese Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style Veggie Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "New York Style Clam Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "New York Style Pepperoni Pizza"
            }
        }
        return pizza
    }
}