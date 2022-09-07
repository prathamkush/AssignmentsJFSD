package sept07;
import java.util.*;

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5 5 41 77 74 22 44 1 12 4 37 34 36 52 0 3 20 22 33 5 1 3 3 4 3 1 4 3 5 5
Sample Output

74 52 37 ERROR! ERROR!
*
 */

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        ArrayList<ArrayList<Integer> > arr
                = new ArrayList<ArrayList<Integer> >();

        for(int i=0;i<t;i++){
            int n = in.nextInt();
            arr.add(new ArrayList<Integer>());
            for (int j = 0; j < n; j++) {
                int x = in.nextInt();
                arr.get(i).add(x);
            }
        }
        System.out.println("Initial 2D-Arraylist : ");
        System.out.println(arr);

        //System.out.println(arr.get(1));
        //System.out.println(arr.get(0).get(2));

        // no of queries
        int query = in.nextInt();
        while(query>0){
            int arrayNumber = in.nextInt();
            int arrayIndex = in.nextInt();

            arrayNumber--;
            arrayIndex--;

            if(arrayNumber<0 || arrayIndex<0){
                System.out.println("ERROR!"+" ");
            }
            else {

                //size of arrayNumber'th array
                int tempSize = arr.get(arrayNumber).size();

                // Checking if array is empty
                if (tempSize == 0) {
                    System.out.print("ERROR!" + " ");
                } else {
                    // Checking for IndexOutofBound
                    if (arrayIndex < 0 || arrayIndex >= tempSize) {
                        System.out.println("ERROR!" + " ");
                    } else {
                        System.out.print(arr.get(arrayNumber).get(arrayIndex) + " ");
                    }

                }
            }
            query--;
        }
    }
}
