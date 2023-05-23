package com.ejemplo.lambdas.S108N1Ex5;

public class Main {
    public static void main(String[] args) {
        PiValueProvider piValueProvider = () -> 3.1415;
        double pi = piValueProvider.getPiValue();
        System.out.println("El valor de Pi es: " + pi);
    }
}

