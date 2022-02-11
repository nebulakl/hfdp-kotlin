class WeatherData : Subject {
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f
    private val observers: MutableList<Observer> = mutableListOf()

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer: Observer in observers) {
            observer.update()
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun getTemperature(): Float {
        return temperature
    }

    fun getHumidity(): Float {
        return humidity
    }

    fun getPressure(): Float {
        return pressure
    }
}