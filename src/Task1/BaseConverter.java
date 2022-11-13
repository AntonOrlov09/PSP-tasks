package Task1;

public class BaseConverter {
    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
