import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the unit (C, F, or K): ");
        String unit = input.next().toUpperCase();

        Temperature temperatureConverter = new Temperature(temperature, unit);

        System.out.println("Temperature in Celsius: " + temperatureConverter.toCelsius());
        System.out.println("Temperature in Fahrenheit: " + temperatureConverter.toFahrenheit());
        System.out.println("Temperature in Kelvin: " + temperatureConverter.toKelvin());

    }
}