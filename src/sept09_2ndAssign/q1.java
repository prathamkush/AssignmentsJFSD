package sept09_2ndAssign;


import java.util.ArrayList;
import java.util.List;

// Square the value list of integers in an array list.
public class q1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(23);
        intList.add(1);
        intList.add(2);
        intList.add(10);
        intList.add(5);
        intList.add(13);

        intList.stream().map(s -> s*s).forEach(System.out::println);
    }

}
