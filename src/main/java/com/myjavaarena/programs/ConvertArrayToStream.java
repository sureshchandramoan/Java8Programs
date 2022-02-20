package com.myjavaarena.programs;

import java.util.Arrays;

public class ConvertArrayToStream {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(values).forEach(System.out::println);
    }
}
