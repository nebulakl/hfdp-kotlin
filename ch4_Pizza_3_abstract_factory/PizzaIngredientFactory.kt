interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Set<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}