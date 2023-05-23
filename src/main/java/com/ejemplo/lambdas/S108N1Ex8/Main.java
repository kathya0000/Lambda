package com.ejemplo.lambdas.S108N1Ex8;

public class Main {
    @FunctionalInterface
    interface StringReverser {
        String reverse(String input);
    }


    public static void main(String[] args) {
        StringReverser reverser = input -> {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        };

        String inputString = "Hola, mundo!";
        String reversedString = reverser.reverse(inputString);

        System.out.println("Cadena original: " + inputString);
        System.out.println("Cadena invertida: " + reversedString);
    }
}
