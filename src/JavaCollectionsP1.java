
//Create an ArrayList of your favorite colors and do the following,
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//2. Iiterate through all elements in an array list.
//3. Insert an element into the array list at the first position.
//4. Retrieve an element (at a specified index) from a given array list.
//5. Update specific array element by given element.
//6. Remove the third element from an array list.
//7. Search for an element in an array list.
//8. Sort a given array list.
//9. Copy/clone one array list into another.
//9. 10. Shuffle elements in an array list.
//11. Reverse elements in an array list.
//12. Extract a portion of an array list.
//13. Compare two array lists.
//14. Swap two elements in an array list.
//15. Join two array lists.
//17. Empty an array list.
//18. Test whether an array list is empty or not.
//19. Trim the capacity of an array list the current list size.
//20. Increase the size of an array list.
//21. Replace the second element of an ArrayList with the specified element.
//22. Print all the ArrayList elements using the position of the elements.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollectionsP1 {
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("White");
        arrayList.add("Pink");
        arrayList.add("Green");
        arrayList.add("Yellow");
        System.out.println(arrayList);
        for(String s:arrayList)
            System.out.println(s);
        arrayList.add(0,"Purple");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(0,"Red");
        arrayList.set(1,"Orange");
        arrayList.set(2,"Black");
        arrayList.set(3,"Purple");
        arrayList.set(4,"Blue");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Black"));
        System.out.println(arrayList.contains("Purple"));
        System.out.println("ArrayList before sorting "+arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting "+arrayList);//ascending order
        ArrayList<String> arrayList1=  (ArrayList<String>) arrayList.clone();
        System.out.println(arrayList1);
        Collections.shuffle(arrayList1);
        System.out.println("after shuffled "+arrayList1);
        Collections.reverse(arrayList1);
        System.out.println("After reversing "+arrayList1);
        List list=  arrayList1.subList(0,3);
        System.out.println("extracting 1st 3 elements "+list);
        list.add("Grey");
        System.out.println(list);
        ArrayList<String> result=new ArrayList<>();
        for(String s:arrayList1) {
            result.add(list.contains(s)?"Yes":"No");
        }
        System.out.println(result);
        Collections.swap(list,1,2);
        System.out.println("After swapping "+list);
        ArrayList<String> join=new ArrayList<>();
        join.addAll(arrayList);
        join.addAll(list);
        System.out.println("after joining all the elements "+join);
        arrayList1.removeAll(arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList.isEmpty());
        arrayList.trimToSize();
        System.out.println("after triming the size of arraylist "+arrayList);
        arrayList.ensureCapacity(100);
        System.out.println("after incresing the capacity of arrayList "+arrayList);
        arrayList.set(1,"Black");
        System.out.println(arrayList);
        ArrayList<String> elements=new ArrayList<>();
        elements.add("black");
        elements.add("white");
        elements.add("red");
        elements.add("pink");
        int n= elements.size();
        for(int k=0;k<n;k++)
        {
            System.out.println(elements.get(k));
        }










    }
}
