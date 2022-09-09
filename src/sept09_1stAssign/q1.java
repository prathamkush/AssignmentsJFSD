package sept09_1stAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class q1 {
    static boolean isEqual(String s1, String s2 ,BiPredicate<String, String> predicate){
        return predicate.test(s1,s2);
    }

    public static Boolean areTwoStringsEqual(ArrayList<String> l1, ArrayList<String> l2) {

        if (l1.size() != l2.size()) {
            return false;
        }
        else {
            int flag = 0;
            for (int i = 0; i < l1.size(); i++) {

                boolean eligible = isEqual(
                        l1.get(i),
                        l2.get(i),
                        (str1, str2) -> {
                            return str1 == str2;
                        }
                );
                if (!eligible) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
            ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("abc", "def", "ghi"));
            ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("abc", "def", "ghi"));

            if(areTwoStringsEqual(l1,l2)){
                System.out.println("ArrayList of Strings is equal");
            }
            else{
                System.out.println("ArrayList of Strings are UNEQUAL");
            }

    }
}
