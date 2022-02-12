class Mocha(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
        this.description = beverage.description + ", Mocha"
    }

    override fun cost(): Double {
        return beverage.cost() + .20
    }
}