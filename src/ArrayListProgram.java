import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String[] args )
    {
        ArrayList<Integer> mylist=new ArrayList<>();
         mylist.add(1);
         mylist.add(2);
         mylist.add(3);
         mylist.contains(2);
         mylist.add(0,5);
        System.out.println(mylist.get(0));
        for(int i:mylist)
            System.out.println(i);
        ArrayList<Integer> myList2= (ArrayList<Integer>) Collections.unmodifiableList(mylist);
        mylist.add(0,7);
        System.out.println(mylist);
    }
}
