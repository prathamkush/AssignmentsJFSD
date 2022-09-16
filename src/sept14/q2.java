package sept14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class q2 {

    public static void main(String[] args) {
        List<Person2> candidateList = new ArrayList<>();

        candidateList.add(new Person2("Arjun", 25000));
        candidateList.add(new Person2("Michael",800000));



        //Optional<Person2> maxVotes  = candidateList.stream().collect(Collectors.maxBy(Comparator.comparing(Person2::getVotes))).stream().findFirst();
        //System.out.println(maxVotes);

    }
}

class Person2 {
public String name;
public int votes;



public Person2(String name, int votes){
        this.name = name;
        this.votes = votes;
        }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    @Override
public String toString(){
        return "Person2{"+
        "name = '" + name + '\'' +
        ", votes = "+ votes +
        '}';
        }

        }

