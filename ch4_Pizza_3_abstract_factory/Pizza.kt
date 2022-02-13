abstract class Pizza {
    lateinit var name: String

    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: Set<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clam: Clams

    abstract fun prepare(): Unit

    fun bake(): Unit {
        println("Bake for 25 minutes at 350")
    }

    open fun cut(): Unit {
        println("Cutting the pizza into diagonal slices")
    }

    fun box(): Unit {
        println("Place pizza in official PizzaStore box")
    }
}