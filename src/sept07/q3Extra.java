package sept07;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class q3Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Pair<String,String>> pairs = new ArrayList<>();
        HashMap<Pair<String,String>, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String str1 = in.next();
            String str2 = in.next();

            //Creating temp pair
            Pair<String, String> tempPair = new Pair<>(str1, str2);

            //Add to ArrayList
            pairs.add(tempPair);

            //if key(tempPair) do not exist then put value 1
            //if key exists, sum 1 to the existing value
            map.merge(tempPair, 1, Integer::sum);
        }

        System.out.println(map);

        System.out.println(pairs);
        System.out.println(map.get(pairs.get(1)));
        //Printing the results
        for(int i=0;i<n;i++){
            int res = map.get(pairs.get(i));
            System.out.print(res+" ");
        }
    }
}
