public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
//        ccd.register(weatherData);
        weatherData.setMeasurements(15,36,1004);
    }
}