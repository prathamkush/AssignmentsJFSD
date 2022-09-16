package sept14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q4 {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("ainu");
        arr.add("areu");
        arr.add("for");
        arr.add("abhimanyu");



        //Stream<Character> sch = arr.chars().mapToObj(i -> (char)i);


        long totalvoewls_char = arr.stream().flatMap(s -> s.chars().mapToObj(c -> (char) c))
                                            .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                                            .count();
        System.out.println(totalvoewls_char);


        System.out.println("--------------------");


        int totalVowels = arr.stream().mapToInt(s -> s.length() - s.replaceAll("[aeiou]", "").length())
                                      .sum();
        System.out.println(totalVowels);


        System.out.println("--------------------");

        String allWords = arr.stream().collect(Collectors.joining(""));
        int totalNoOfVowels = allWords.length() - allWords.replaceAll("[aeiou]", "").length();
        System.out.println(totalNoOfVowels);





    }
}
