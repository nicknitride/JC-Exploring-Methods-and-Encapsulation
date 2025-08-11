package org.nickproj;

public class Converter {

    static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0/5.0) + 32;
    }

    static double celsiusToFahrenheit(double celsius, String useless){
        System.out.println("Calling celsius overload to invoke fahrenheit converter");
        return fahrenheitToCelsius(celsius);
    }
    static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0/9.0;
    }
}
