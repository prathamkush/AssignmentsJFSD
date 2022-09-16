package sept12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q3 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Ravi","Delhi"));
        list.add(new Employee(1, "Ravi","Delhi"));
        list.add(new Employee(3, "Rekha","Chennai"));
        list.add(new Employee(4, "Ram","Siliguri"));
        list.add(new Employee(5, "Raj","Chennai"));
        list.add(new Employee(6, "Raj","Mumbai"));
        list.add(new Employee(7, "Rekha","Delhi"));

        list.stream().distinct().forEach(s -> System.out.println(s.id+" "+s.name+" "+s.city));

        list.stream().distinct().skip(1).forEach(s -> System.out.println(s.id+" "+s.name+" "+s.city));
        // Stream<Employee> s =
        //ArrayList<Employee> allDistincts = s.collect(Collectors.toCollection(ArrayList::new));


    }
}

class Employee{
    int id;
    String name;
    String city;

    Employee(int id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }
}
