package program.interview.occurence.wordcount;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceWordCount {

    public static void main(String[] args) {

        String str="This my first program. Welcome to in my first program";

        wordCount(str).forEach((key,value)->System.out.println(key+" : "+value));
    }

    public static Map<String,Long> wordCount(String strArr){

       return Arrays.stream(strArr.split("\\s+")).collect(Collectors.groupingBy(word->word,Collectors.counting()));

    }
}
