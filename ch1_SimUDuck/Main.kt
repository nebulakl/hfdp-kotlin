fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    val model: Duck = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}
