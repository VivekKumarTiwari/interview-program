package com.stream;

import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamArr {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        OptionalInt min = IntStream.of(arr).min();
        min.ifPresent(System.out::println);

        IntStream.of(arr).max().ifPresent(System.out::println);

        IntStream.of(arr).mapToObj(Integer::valueOf).sorted(Comparator.reverseOrder())
                .forEach(data->System.out.print(data+ " "));

        long count = IntStream.of(arr).count();

        System.out.print(count);

    }
}
