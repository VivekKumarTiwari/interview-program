package com.stream;

import java.util.stream.IntStream;

public class IntStreamSum {

    public static void main(String[] args) {
        int sum = IntStream.range(10, 15).sum();// 10+11+12+13+14 = 60
        System.out.println(sum);

    }
}
