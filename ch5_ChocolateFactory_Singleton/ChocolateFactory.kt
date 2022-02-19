class ChocolateBoiler {
    private var empty: Boolean = true
    private var boiled: Boolean = false

    companion object {
        private var uniqueInstance: ChocolateBoiler? = null

        fun getInstance(): ChocolateBoiler? {
            if (uniqueInstance == null) {
                println("Creating unique instance of Chocolate Boiler")
                uniqueInstance = ChocolateBoiler()
            }
            println("Returning instance of Chocolate Boiler")
            return uniqueInstance
        }
    }

    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
            println("fill the boiler with a milk/chocolate mixture")
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true
            println("drain the boiled milk and chocolate")
        }
    }

    fun boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true
            println("bring the contents to a boil")
        }
    }

    fun isEmpty(): Boolean {
        return empty
    }

    fun isBoiled(): Boolean {
        return boiled
    }
}

fun main() {
    val boiler: ChocolateBoiler? = ChocolateBoiler.getInstance()
    boiler!!.fill()
    boiler.boil()
    boiler.drain()

    val boiler2: ChocolateBoiler? = ChocolateBoiler.getInstance()

    println("Hashcode for boiler: ${boiler.hashCode()}")
    println("Hashcode for boiler2: ${boiler2.hashCode()}")
}