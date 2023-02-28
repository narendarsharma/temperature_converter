import java.util.Scanner;

public class Temperature{
   private double temperature;
    private String unit;

    public Temperature(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double toCelsius() {
        switch (unit) {
            case "F":
                return (temperature - 32) * 5 / 9;
            case "K":
                return temperature - 273.15;
            default:
                return temperature;
        }
    }

    public double toFahrenheit() {
        switch (unit) {
            case "C":
                return (temperature * 9 / 5) + 32;
            case "K":
                return (temperature - 273.15) * 9 / 5 + 32;
            default:
                return temperature;
        }
    }

    public double toKelvin() {
        switch (unit) {
            case "C":
                return temperature + 273.15;
            case "F":
                return (temperature - 32) * 5 / 9 + 273.15;
            default:
                return temperature;
        }
    }

}
