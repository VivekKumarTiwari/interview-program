package com.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        String str="java";
        Character c = str.chars().mapToObj(data -> (char) data)
                .collect(Collectors.groupingBy(charData -> charData,
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(data -> data.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println("First Non Repeated Character : "+c);
    }
}
