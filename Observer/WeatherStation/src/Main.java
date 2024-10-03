public class Main {
    public static void main(String[] args) {
        // Step 1: Create the subject (WeatherStation)
        WeatherStation weatherStation = new WeatherStation();

        // Step 2: Create observers (PhoneDisplay and WindowDisplay)
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        // Step 3: Set the temperature in the weather station, which will notify all observers
        weatherStation.setTemperature(25.5f);  // This will notify all registered observers
        weatherStation.setTemperature(30.0f);  // Observers get notified again on state change
    }
}
