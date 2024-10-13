package program.interview.sum.evennumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,8,9,10,20,15,30,17);

        Optional<Integer> reduce = list.stream().filter(data -> data > 10).filter(data -> data % 2 == 0).reduce((a, b) -> a + b);

        reduce.ifPresent(integer -> System.out.println("Sum of even numbers :" + integer));

    }
}
