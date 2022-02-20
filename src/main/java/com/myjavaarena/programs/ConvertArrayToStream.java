package com.myjavaarena.programs;

import java.util.Arrays;

public class ConvertArrayToStream {
    public static void main(String[] args) {
        int[] intValues = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(intValues).forEach(System.out::print);
        System.out.println("");
        long[] longValues = { 5,3,7,2,8,6 };
        Arrays.stream(longValues).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(longValues).forEachOrdered(System.out::print);
        System.out.println("");
        Arrays.stream(longValues).sorted().boxed().forEach(System.out::print);
        String[] stringValues = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
       Arrays.stream(stringValues).forEach(System.out::println);

    }
}
