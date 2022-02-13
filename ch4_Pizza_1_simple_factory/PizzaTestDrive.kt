fun main() {
    val factory: SimplePizzaFactory = SimplePizzaFactory()
    val store: PizzaStore = PizzaStore(factory)

    var pizza: Pizza = store.orderPizza("cheese")
    println("We ordered a ${pizza.name}\n")

    pizza = store.orderPizza("veggie")
    println("We ordered a ${pizza.name}\n")

    pizza = store.orderPizza("clam")
    println("We ordered a ${pizza.name}\n")

    pizza = store.orderPizza("pepperoni")
    println("We ordered a ${pizza.name}\n")
}