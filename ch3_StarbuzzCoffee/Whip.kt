class Whip(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
        this.description = beverage.description + ", Whip"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}