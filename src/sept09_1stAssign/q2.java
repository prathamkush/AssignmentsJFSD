package sept09_1stAssign;

/*
Write a program with ArrayList<String> strings,
Comparator<String> comp that checks by calling Collections.shuffle on the given array list
of Strings until the elements are in ascending order, as determined by the comparator interface

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q2 {



    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("def", "ghi", "abc"));
        ArrayList<String> list2 = new ArrayList<>(list1);
        Collections.sort(list2);
        System.out.println(list1);

        while(list1 != list2){
            //Collections.sort(persons, (o1,o2) -> o1.getCountry().compareTo(o2.getCountry()));
            Collections.shuffle(list1);

        }
        System.out.println(list1);
    }


}
