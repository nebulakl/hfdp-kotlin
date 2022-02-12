class SteamedMilk(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
        this.description = beverage.description + ", Steamed Milk"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}