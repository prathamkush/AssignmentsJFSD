package sept14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class q5 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Arjun",  29, 25000));
        list.add(new Employee("Michael",33, 800000));
        list.add(new Employee("Jordan",40, 900000));

        //Max
        Optional<Employee> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Max salary : "+maxSalary.get().salary);

        //Min
        Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Min salary : "+minSalary.get().salary);

        //Average
        double averageSalary = list.stream().collect(Collectors.averagingInt(emp -> emp.getSalary()));
        System.out.println("Average Salary : "+averageSalary);


        // Summing all salaries
        int sumOfSalary = list.stream().collect(Collectors.summingInt(emp -> emp.salary));
        System.out.println("Sum of all Salaries : "+sumOfSalary);

        // Oldest person
        Optional<Employee> oldest = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println("Oldest Person : "+oldest.get());






    }
}

class Employee {
     String name;
     int age;
    int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Person2{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", salary = "+ salary +
                '}';
    }

}

