// Concrete observer: Phone Display
public class PhoneDisplay implements Observer {
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }

    // This is called when the weather station changes the temperature
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature + " degrees.");
    }
}


