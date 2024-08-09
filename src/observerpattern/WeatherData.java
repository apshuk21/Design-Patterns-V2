package observerpattern;

import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);

        if (index >= 1) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        measurementsChanged();
    }


}
