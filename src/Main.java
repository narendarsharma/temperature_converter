import java.io.IOException;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature = 0;
        boolean inputValid = false;
        String unit = " ";

        // Get temperature value from user input
        while (!inputValid) {
            try {
                System.out.print("Enter the temperature value: ");
                temperature = scanner.nextDouble();
                inputValid = true;
                System.out.print("Enter the unit (C, F, or K): ");
                 unit = scanner.next().toUpperCase();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }

        }

        Temperature temperatureConverter = new Temperature(temperature, unit);
        System.out.println("Temperature in Celsius: " + temperatureConverter.toCelsius());
        System.out.println("Temperature in Fahrenheit: " + temperatureConverter.toFahrenheit());
        System.out.println("Temperature in Kelvin: " + temperatureConverter.toKelvin());


    }
}