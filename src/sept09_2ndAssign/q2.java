package sept09_2ndAssign;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// Write a program to take input of an array list of integers, return the sum of all the positives ones.
// If the array list empty or if there aren't any positive integers, return 0.
public class q2 {
    // Input
    // 5 1 -3 4 -2 5
    static int sumPositiveInts(ArrayList<Integer> arr, int n){
        return arr.stream().filter(s -> s>0).mapToInt(s -> s.intValue()).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        q2 obj = new q2();

        // n = number of integers i arraylist
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            int x = in.nextInt();
            arr.add(x);
        }
        System.out.println(obj.sumPositiveInts(arr,n));
    }
}
