class ForecastDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var currentPressure: Float = 29.92f
    private var lastPressure: Float = 0f
    private val weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.getPressure()
        display()
    }

    override fun display() {
        print("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather")
        }
    }
}