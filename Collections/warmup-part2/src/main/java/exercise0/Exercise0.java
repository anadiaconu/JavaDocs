package exercise0;

import java.util.HashMap;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys) and
 *          print all its elements.
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughMap(){

        // TODO Exercise #0 a) Create a Map (HashMap) and add elements to it (using put() method)
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Ion", 5);
        hm.put("Raluca", 8);
        hm.put("Andreea", 10);
        hm.put("Vasile", 9);
        // TODO Exercise #0 a) Hint: Don't forget to specify the types of the key and value when creating the Map

        // TODO Exercise #0 b) Iterate over the Map using keySet() method and print all its elements
        // TODO Exercise #0 b) The elements could be printed like this: [key1=value1, key2=value2, ...]

        System.out.print("[");
        for (String key : hm.keySet()) {
            System.out.print(key+"="+hm.get(key)+",");

        }
        System.out.print("]");

    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();
    }
}
