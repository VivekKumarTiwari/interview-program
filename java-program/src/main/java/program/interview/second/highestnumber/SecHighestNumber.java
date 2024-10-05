package program.interview.second.highestnumber;

import java.util.Arrays;
import java.util.Comparator;

public class SecHighestNumber {

    public static void main(String[] args) {

        Integer[] arr={23,45,67,2,67,34,768,65};
        System.out.println(secondHighestNumber(arr));

    }

    public static Integer secondHighestNumber(Integer[] arr){
      return   Arrays.stream(arr).sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().orElseThrow();
    }
}
