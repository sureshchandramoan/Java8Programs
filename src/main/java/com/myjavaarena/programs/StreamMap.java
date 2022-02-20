package com.myjavaarena.programs;

import java.util.Arrays;
import java.util.List;

/**
 * Example for map method in Stream
 */
public class StreamMap {
    public static void main(String[] args) {
        List<String> stringValues = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        stringValues.stream().map(val -> val.toUpperCase() + " ").forEach(System.out::print);
        System.out.println("");
        stringValues.stream().map(val -> val.toLowerCase() + " ").forEach(System.out::print);
    }
}
