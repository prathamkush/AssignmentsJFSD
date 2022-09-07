package sept07;


import java.util.ArrayList;

/*
Write a program to see whether an element exists in the
third position and if it is  replace the
third position of a ArrayList with the newly
specified element ?

 */

public class q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Initial List : "+ arr);

        //We have to perform this operatin for index 2
        int index = 2;

        //Check for this element (input)
        int x = 3;

        //Newly specified element(input)
        int y = 6;

        //checking
        if(index<0 || index>=arr.size()){
            System.out.println("Operation cannot be performed! Check the list size and index!!");
        }

        else if(arr.get(index) != x) {
            System.out.println("Element "+ x + " not found! ArrayList remains same!!");
        }
        else{
            arr.set(index,y);
            System.out.println("Changes made at index "+index+", Updated ArrayList : ");
            System.out.println(arr);
        }
    }
}
