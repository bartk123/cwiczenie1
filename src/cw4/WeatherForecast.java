
public class WeatherForecast implements Observer, DisplayElement {
    private double currentPressure = 29.92;  
    private double lastPressure;
    private WeatherData weatherData;

    public WeatherForecast(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Prognoza pogody: ");
        if (currentPressure > lastPressure) {
            System.out.println("Pogoda się poprawia!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Bez zmian");
        } else if (currentPressure < lastPressure) {
            System.out.println("Uwaga na chłodniejszą, deszczową pogodę");
        }
    }
}
