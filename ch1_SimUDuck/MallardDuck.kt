class MallardDuck : Duck() {
    override var quackBehavior: QuackBehavior = Quack()
    override var flyBehavior: FlyBehavior = FlyWithWings()

    override fun display() {
        println("I'm a real Mallard duck")
    }

}