package sept07;

import java.util.*;

/*
Write a program to check among the keys that has the  greater key then the given key  in a tree map
 */

public class q5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(10,"Red");
        tree.put(20,"Green");
        tree.put(30,"Black");
        tree.put(40,"White");
        tree.put(50,"Pink");

        System.out.println("Initial TreeMap : "+ tree);

        //SAMPLE INPUT USED FOR TESTING
        ArrayList<Integer> input = new ArrayList<>();
        for(int i=7;i<70;i+=7){
            input.add(i);
        }
        System.out.println("Input key values to check for : "+ input);


        System.out.println("Greater key-values than the input are : ");
        for(int i=0;i<input.size();i++){
            int givenKey = input.get(i);

            if(tree.higherKey(givenKey)==null){
                System.out.println("null ");
            }
            else {
                System.out.println(tree.higherKey(givenKey) + " " + tree.get((tree.higherKey(givenKey))));
            }
        }

    }
}
