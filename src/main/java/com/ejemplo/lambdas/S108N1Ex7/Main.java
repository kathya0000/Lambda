package com.ejemplo.lambdas.S108N1Ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Java");
        lista.add(42);
        lista.add("Lambdas");

        lista.stream()
                .filter(elemento -> elemento instanceof String)
                .map(elemento -> (String) elemento)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}

