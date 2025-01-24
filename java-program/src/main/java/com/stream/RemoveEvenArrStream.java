package com.stream;

import java.util.Arrays;

public class RemoveEvenArrStream {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int[] array = Arrays.stream(arr).filter(data -> data % 2 != 0).toArray();

        // 1,3,5,7,9
        System.out.println("Removed even numbers from a array data : "+Arrays.toString(array));
    }
}
