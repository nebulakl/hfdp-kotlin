class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> NYStyleCheesePizza()
            "veggie" -> NYStyleVeggiePizza()
            "clam" -> NYStyleClamPizza()
            "pepperoni" -> NYStylePepperoniPizza()

            else -> NYStyleCheesePizza()
        }
    }
}