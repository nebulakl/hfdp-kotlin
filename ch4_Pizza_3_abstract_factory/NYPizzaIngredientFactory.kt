class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }

    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createVeggies(): Set<Veggies> {
        return setOf<Veggies>(Garlic(), Onion(), Mushroom(), RedPepper())
    }
}