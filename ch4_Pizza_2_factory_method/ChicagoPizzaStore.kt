class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {

        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "veggie" -> ChicagoStyleVeggiePizza()
            "clam" -> ChicagoStyleClamPizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()

            else -> ChicagoStyleCheesePizza()
        }
    }
}