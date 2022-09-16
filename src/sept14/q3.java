package sept14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class q3 {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("ainu");
        arr.add("areu");
        arr.add("for");
        arr.add("abhimanyu");

        List<String> requiredList = arr.stream().filter(s -> s.charAt(0) == 'a' || s.charAt(0) == 'A').filter(s -> s.charAt(s.length()-1) == 'u' || s.charAt(s.length()-1) == 'U').collect(Collectors.toList());
        System.out.println(requiredList);
    }
}
