fun main(args: Array<String>) {
    val weatherData: WeatherData = WeatherData()

    val currentDisplay: CurrentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay: StatisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay: ForecastDisplay = ForecastDisplay(weatherData)
    val heatIndexDisplay: HeatIndexDisplay = HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}