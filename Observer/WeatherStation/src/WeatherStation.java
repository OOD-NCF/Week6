import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
public class WeatherStation {
    private List<Observer> observers;  // List of observers
    private float temperature;         // Internal state

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    // Method to add an observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers of a change in temperature
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);  // Pass the updated temperature
        }
    }

    // Method to change the temperature (state change)
    public void setTemperature(float temperature) {
        this.temperature = temperature;   // Update the internal state
        System.out.println("WeatherStation: Temperature changed to " + temperature + " degrees.");
        notifyObservers();  // Notify all observers of the state change
    }
}
