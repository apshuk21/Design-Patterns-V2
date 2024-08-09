package observerpattern;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject s) {
        this.weatherData = s;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        temperature = temperature;
        humidity = humidity;
    }
}
