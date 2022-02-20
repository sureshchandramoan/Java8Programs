package com.myjavaarena.programs;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamFilter {
    public static void main(String[] args) {
        Predicate<String> filter = (val) -> val.length() == 6;
        List<String> stringValues = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

        Consumer<String> print = (val) -> System.out.println("val = " + val);
        stringValues.stream().filter(filter).forEach(print);
        System.out.println("");

        stringValues.stream().filter(val -> val.startsWith("T")).forEach(System.out::println);
        System.out.println("");

        stringValues.subList(1,5).forEach(System.out::println);
        System.out.println("count of days = " + stringValues.stream().count());
        System.out.println("");

        System.out.println("first day of the week in Asc = " + stringValues.stream().min(Comparator.naturalOrder()).get());
        System.out.println("");

        System.out.println("last day of the week in Asc = " + stringValues.stream().max(Comparator.naturalOrder()).get());
        System.out.println("");

    }

}
