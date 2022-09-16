package sept12;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class q4 {

    public static void main(String[] args) {
/*
        List<Pair<String,String>> list = new ArrayList<>();

        list.add("Singapore", "Asia");
        list.add("India", "Asia");
        list.add("USA", "America");
        list.add("UK", "Europe");
        list.add("Australia", "Asia");

        list.stream().distinct().forEach(s -> System.out.println(s.id+" "+s.name+" "+s.city));
        list.stream().distinct().skip(1).forEach(s -> System.out.println(s.id+" "+s.name+" "+s.city));*/

        /*

        1: list.stream().map(MethodReference::checkLegnth).forEach(System.out::println);
        2: 1. list.stream().distinct().forEach(s -> System.out.println(s.id+" "+s.name+" "+s.city));
            2. list.stream().distinct().skip(1).forEach(s -> System.out.println(s.id+" "+s.name+" "+s.city));

        3: list.add("Singapore", "Asia");
            list.add("India", "Asia");
            list.add("USA", "America");
            list.add("UK", "Europe");
            list.add("Australia", "Asia");

Return true or false if the following conditions match:
1. Any Match -> Asia
2. All Match -> Europe
3. None Match -> Asia

1. System.out.println(list.stream().anyMatch(s -> s.getContinent().equals("Asia")); -> True
2. System.out.println(list.stream().allMatch(s -> s.getContinent().equals("Europe")); -> False
3. System.out.println(list.stream().noneMatch(s -> s.getContinent().equals("Asia")); -> False


4:
 Write a program to create and find the collection of the following:
 list.add(new Employee(1, "Ravi","Delhi"));
 list.add(new Employee(2, "Raj","Mumbai"));
 list.add(new Employee(3, "Rekha","Chennai"));
 list.add(new Employee(4, "Ram","Siliguri"));
 list.add(new Employee(5, "Raj","Chennai"));
 list.add(new Employee(6, "Raj","Mumbai"));
 list.add(new Employee(7, "Rekha","Delhi"));
Return the element
1. Get the first any person on the list who belongs to a particular place
*
Let particularPlace = "Mumbai" (say)
Optional<Employee> p =  list.stream().filter(s -> s.getCity().equals(particularPlace)).findAny();

System.Out.Println(p.get().getName());

        */


    }
}

