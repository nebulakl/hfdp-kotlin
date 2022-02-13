class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }

    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createVeggies(): Set<Veggies> {
        return setOf<Veggies>(BlackOlives(), Spinach(), Eggplant())
    }
}