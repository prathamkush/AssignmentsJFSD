package sept09_1stAssign;

/*
Write a program with ArrayList<String> strings,
Comparator<String> comp that checks by calling Collections.shuffle on the given array list
of Strings until the elements are in ascending order, as determined by the comparator interface

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("def", "ghi", "abc"));
        ArrayList<String> list2 = new ArrayList<>(list1);
        Collections.sort(list2);
        System.out.println("Initial List : ");
        System.out.println(list1);


        while(! q1.areTwoStringsEqual(list1,list2)){

            Collections.shuffle(list1);

        }
        System.out.println("After shuffle sorting : ");
        System.out.println(list1);
    }


}
