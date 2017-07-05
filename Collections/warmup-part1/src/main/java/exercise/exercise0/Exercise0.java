package exercise.exercise0;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughList(){

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it

        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Buna");
        myList.add("Eu sunt Ana");
        myList.add("Lucrez la exercitiul 0");

        ListIterator<String> it = myList.listIterator();
        while(it.hasNext())
            System.out.println(it.next());

        for(int i = 0; i<myList.size(); i++)
            System.out.println(myList.get(i));

        for(String s : myList)
            System.out.println(s);

        // TODO Exercise #0 a) Don't forget to specify the type of the list (Integer, String etc.)

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements

        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements

        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements

    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        Exercise0 e0 = new Exercise0();
        e0.iterateThroughList();
    }
}
