class PizzaStore(val factory: SimplePizzaFactory) {
    fun orderPizza(type: String): Pizza {
        val pizza = factory.createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}