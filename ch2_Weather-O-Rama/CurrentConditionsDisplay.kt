class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private val weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.getTemperature()
        this.humidity = weatherData.getHumidity()
        display()
    }

    override fun display() {
        println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity")
    }
}