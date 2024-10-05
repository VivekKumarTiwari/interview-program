package program.interview.stringuppercase;

import java.util.Arrays;
import java.util.List;

public class ConvertStrUpperCase {
    public static void main(String[] args) {

        String[] arrStr={"Ram","Deva","Ramesh"};
        System.out.println(converStrToUpperCase(arrStr));

    }

    public static List<String> converStrToUpperCase(String[] arrStr){

       return Arrays.stream(arrStr).map(String::toUpperCase).toList();

    }
}
