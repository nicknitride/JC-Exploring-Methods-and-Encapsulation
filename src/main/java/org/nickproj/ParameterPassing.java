package org.nickproj;

public class ParameterPassing {
    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }
}
