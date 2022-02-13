abstract class Pizza {
    lateinit var name: String
    lateinit var dough: String
    lateinit var sauce: String
    val toppings = mutableSetOf<String>()

    fun prepare(): Unit {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings:")
        for (topping in toppings) {
            println("    $topping")
        }
    }

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