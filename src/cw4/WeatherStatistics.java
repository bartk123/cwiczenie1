
public class WeatherStatistics implements Observer, DisplayElement {
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    private double sumTemp = 0.0;
    private int numReadings;
    private WeatherData weatherData;

    public WeatherStatistics(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        sumTemp += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Statystyki pogodowe:");
        System.out.println("Średnia temperatura: " + (sumTemp / numReadings));
        System.out.println("Najwyższa temperatura: " + maxTemp);
        System.out.println("Najniższa temperatura: " + minTemp);
    }
}
