class Soy(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
        this.description = beverage.description + ", Soy"
    }

    override fun cost(): Double {
        return beverage.cost() + .15
    }
}