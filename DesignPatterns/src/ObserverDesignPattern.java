import java.util.ArrayList;
import java.util.List;

interface WeatherStation {
    void addObserver(WeatherDisplay observer);
    void notifyObservers();
}

class WeatherStationImpl implements WeatherStation {
    private List<WeatherDisplay> observers = new ArrayList<>();
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherDisplay observer : observers) {
            observer.update(temperature);
        }
    }
}

interface WeatherDisplay {
    void update(float temperature);
}

class WeatherApp implements WeatherDisplay {
    @Override
    public void update(float temperature) {
        System.out.println("Weather App: Temperature is now " + temperature + "°C");
    }
}

public class ObserverDesignPattern {
    public static void main(String[] args) {
        WeatherStationImpl weatherStation = new WeatherStationImpl();

        WeatherDisplay weatherApp = new WeatherApp();

        weatherStation.addObserver(weatherApp);

        weatherStation.setTemperature(25.0f);

        weatherStation.setTemperature(28.5f);
    }
}
