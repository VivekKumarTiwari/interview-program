package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortExample {

    public static void main(String[] args) {
        List<String> arrList = Arrays.asList("Aman", "Roma", "Ram Babu", "Java classified");

        List<String> list = arrList.stream().sorted().toList();

        System.out.println("Asending Order : " + list);

        List<String> descList = arrList.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Descending Order : " + descList);
    }
}
