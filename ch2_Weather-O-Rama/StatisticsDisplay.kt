class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var maxTemp: Float = 0f
    private var minTemp: Float = 200f
    private var tempSum: Float = 0.0f
    private var numReadings: Int = 0
    private val weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update() {
        val temp: Float = weatherData.getTemperature()
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }
        if (temp < minTemp) {
            minTemp = temp
        }
        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp)
    }
}