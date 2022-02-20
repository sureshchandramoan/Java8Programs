package com.myjavaarena.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Example for map method in Stream
 */
public class StreamMap {
    public static void main(String[] args) {
        List<String> stringValues = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        Function<String, String> upper = (val) -> val.toUpperCase(Locale.ROOT);
        Function<String, String> bracket = (val) -> "["+val + "] ";
        stringValues.stream().map(upper.andThen(bracket)).forEach(System.out::print);
        System.out.println("");
        stringValues.stream().map(val -> val.toLowerCase() + " ").forEach(System.out::print);
        System.out.println("");
        Supplier<String> values = () -> "Welcome to the My Java Arena";
        System.out.println("values.get() = " + values.get());
        
    }
}
