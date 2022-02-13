class SimplePizzaFactory {
    fun createPizza(type: String): Pizza {
        lateinit var pizza: Pizza

        when (type) {
            "cheese" -> pizza = CheesePizza()
            "pepperoni" -> pizza = PepperoniPizza()
            "clam" -> pizza = ClamPizza()
            "veggie" -> pizza = VeggiePizza()
        }
        return pizza
    }
}