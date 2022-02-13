class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza {
        lateinit var pizza: Pizza
        val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

        when (item) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style Veggie Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "Chicago Style Clam Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "Chicago Style Pepperoni Pizza"
            }
        }
        return pizza
    }
}