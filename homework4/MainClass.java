package homework4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        //testing MyLinkedList
        MyLinkedList<String> list1 = new MyLinkedList<>();

        for(int i = 0; i < 10; i++) {
            list1.add("new" + i + " ");
        }
        System.out.println("Current size of list: " + list1.size());
        System.out.println(list1.toString());

        System.out.println();
        list1.add(5, "new10");
        System.out.println("Current size of list: " + list1.size());
        System.out.println(list1.toString());
        list1.add(11, "new11");
        System.out.println("Current size of list: " + list1.size());
        System.out.println(list1.toString());

        System.out.println(list1.get(6) + " is placed by index 6");
        System.out.println(list1.indexOf("new11") + " is an index of element new11");


        System.out.println();
        System.out.println(list1.remove(4) + " was removed");
        System.out.println(list1.toString());

        System.out.println();
        System.out.println(list1.set(2, "new12") + "is placed instead of element in 2nd index");
        System.out.println(list1.toString());

        list1.clear();
        System.out.println();
        System.out.println("Cleared list: " + list1.toString());
        System.out.println(list1.size());
        System.out.println();


        //
        //testing MyLinkedList in comparison with java LinkedList
        LinkedList<String> notMyList = new LinkedList<>();
        MyLinkedList<String> myList = new MyLinkedList<>();

        //testing add elements
        long start1 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            myList.add("new" + i + " ");
        }
        System.out.println("Time of adding element in my List: " + (System.nanoTime() - start1));
        System.out.println(Arrays.toString(myList.toArray()));

        long start2 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            notMyList.add("new" + i + " ");
        }
        System.out.println("Time of adding element in NOT my List: " + (System.nanoTime() - start2));
        System.out.println(Arrays.toString(notMyList.toArray()));

        //testing search an index of element
        long start3 = System.nanoTime();
        myList.indexOf("new8900");
        System.out.println("Time of searching an Index in my List: " + (System.nanoTime() - start3));

        long start4 = System.nanoTime();
        notMyList.indexOf("new8900");
        System.out.println("Time of searching an Index NOT in my List: " + (System.nanoTime() - start4));

        //testing search an element by index
        long start5 = System.nanoTime();
        myList.get(9998);
        System.out.println("Time of searching an Element by index in ny List: " + (System.nanoTime() - start5));

        long start6 = System.nanoTime();
        notMyList.get(9998);
        System.out.println("Time of searching an Element by index NOT in ny List: " + (System.nanoTime() - start6));

        //testing remove element
        long start7 = System.nanoTime();
        myList.remove(7777);
        System.out.println("Time of removing element in my List: " + (System.nanoTime() - start7));

        long start8 = System.nanoTime();
        notMyList.remove(7777);
        System.out.println("Time of removing element in NOT my List: " + (System.nanoTime() - start8));
    }
}
