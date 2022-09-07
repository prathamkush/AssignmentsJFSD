package sept07;
import java.util.Iterator;
import java.util.LinkedList;


/*
Write a program to swap two elements in the list at the specified position of the linked list
 */

public class q4 {

    public void display(LinkedList<Integer> list){
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n");
        System.out.println("----------------");
    }

    public static void swapElements(LinkedList<Integer> list, int e1, int e2){
        //Get indices
        int ind1 = list.indexOf(e1), ind2 = list.indexOf(e2);

        //element(s) not present
        if(ind1==-1 || ind2==-1){
            return;
        }

        list.set(ind1,e2);
        list.set(ind2,e1);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        q4 obj = new q4();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Initial List : ");
        obj.display(list);

        //Input elements to swap
        int e1 = 20, e2 = 40;

        swapElements(list,e1,e2);

        System.out.println("List after swapping : ");
        obj.display(list);
    }
}
