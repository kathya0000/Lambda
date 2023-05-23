package com.ejemplo.lambdas.S108N1Ex2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hola", "Mundo", "OpenAI", "Java", "Lambdas", "Hola Mundo");

        List<String> result = filterStrings(strings);

        System.out.println(result);
    }

    public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
