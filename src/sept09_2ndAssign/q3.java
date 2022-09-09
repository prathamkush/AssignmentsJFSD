package sept09_2ndAssign;




import java.util.*;


//Get an input list of string of multiple words with a single space between each of them.
// Abbreviate the word and return the word initials.

//Sample Input:   const input = 'Hello World How Are You?';
//Sample Output: HWHAY
public class q3 {




    public static void main(String[] args) {
        q3 obj = new q3();
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String[] str = s.split(" ");

        List<String> list = new ArrayList<String>();
        Collections.addAll(list, str);
        System.out.println(list);

        list.stream().map(st -> st.toUpperCase()).map(st -> st.charAt(0)).forEach(System.out::print);
        //String output = Arrays.stream(inputString.split("\\s+")).map(t -> t.substring(0, 1)).collect(Collectors.joining(""));


    }
}
