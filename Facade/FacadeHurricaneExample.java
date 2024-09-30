public class FacadeHurricaneExample {
    public static void main(String[] args) {
        // Create subsystem components
        WeatherDataCollector dataCollector = new WeatherDataCollector();
        AtmosphericSimulator simulator = new AtmosphericSimulator();
        DataAnalyzer analyzer = new DataAnalyzer();
        NotificationSystem notifier = new NotificationSystem();

        // Create facade
        HurricanePredictionFacade predictionFacade = new HurricanePredictionFacade(dataCollector, simulator, analyzer, notifier);

        // Client interaction with simplified interface
        predictionFacade.predictHurricane();
    }
}





