// Facade: Hurricane Prediction Facade
class HurricanePredictionFacade {
    private WeatherDataCollector dataCollector;
    private AtmosphericSimulator simulator;
    private DataAnalyzer analyzer;
    private NotificationSystem notifier;

    public HurricanePredictionFacade(WeatherDataCollector dataCollector,
                                     AtmosphericSimulator simulator,
                                     DataAnalyzer analyzer,
                                     NotificationSystem notifier) {
        this.dataCollector = dataCollector;
        this.simulator = simulator;
        this.analyzer = analyzer;
        this.notifier = notifier;
    }

    // Simplified interface for predicting hurricanes
    public void predictHurricane() {
        System.out.println("Starting hurricane prediction process...");
        dataCollector.collectData();
        simulator.runSimulation();

        boolean hurricaneLikely = analyzer.analyzeData();

        if (hurricaneLikely) {
            System.out.println("Hurricane predicted! Taking further action...");
            notifier.sendAlert();
        } else {
            System.out.println("No hurricane predicted. System monitoring continues.");
        }
    }
}
