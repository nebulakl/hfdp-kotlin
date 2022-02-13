abstract class Pizza {
    lateinit var name: String
    lateinit var dough: String
    lateinit var sauce: String
    var toppings = mutableListOf<String>()

    fun prepare(): Unit {
        println("Preparing $name")
    }

    fun bake(): Unit {
        println("Baking $name")
    }

    fun cut(): Unit {
        println("Cutting $name")
    }

    fun box(): Unit {
        println("Boxing $name")
    }
}