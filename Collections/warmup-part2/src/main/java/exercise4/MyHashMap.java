package exercise4;

import java.util.*;

/**
 * Exercise 3. Implement a HashMap from scratch. In order to pass all the tests
 * you need to implement all the methods defined below. The key-value pair will
 * be encapsulated in the MyHashMap.MyEntry object defined below.
 *
 * The buckets list in which each MyEntry object will be stored is stored in "buckets" object.
 * The hash function that you will use in order to store a pair in a specific bucket will be
 * the one presented earlier: (hashcode value) modulo (bucket array size)
 */
public class MyHashMap {

    private ArrayList<LinkedList<MyEntry>> buckets;

    private final int BUCKET_ARRAY_SIZE = 16;

    public MyHashMap() {

        // TODO Initialize buckets list
        buckets = new ArrayList<LinkedList<MyEntry>>(BUCKET_ARRAY_SIZE);
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++)
            buckets.add(new LinkedList<MyEntry>());
    }

    public String get(String key) {
        // TODO

        if (key==null) return null;
        int i = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
        for(int j = 0; j<buckets.get(i).size();j++)
            if(buckets.get(i).get(j).getKey().equals(key))

                return buckets.get(i).get(j).getValue();

        return null;
    }

    public void put(String key, String value) {
        // TODO
        int i=0;
        if(key != null) i = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE) ;
        for(int j = 0; j<buckets.get(i).size();j++) {
            if (buckets.get(i).get(j).getKey().equals(key)) {
                buckets.get(i).get(j).setValue(value);
                return;
            }
        }
        buckets.get(i).add(new MyEntry(key, value));
    }

    public Set<String> keySet() {
        // TODO
        Set<String>s = new HashSet<String>();
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++){
            for(int j = 0; j<buckets.get(i).size(); j++){
                s.add(buckets.get(i).get(j).getKey());}}


        return s;
    }

    public Collection<String> values() {
        Set<String>s = new HashSet<String>();
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++){
            for(int j = 0; j<buckets.get(i).size(); j++) {
                s.add(buckets.get(i).get(j).getValue());
            }}

        return s;
    }

    public String remove(String key) {
        // TODO Returns the value associated with the key removed from the map or null if the key wasn't found
        int i=0;
        String value="";
        if(key != null) i = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE) ;
        for(int j = 0; j<buckets.get(i).size();j++) {
            if (buckets.get(i).get(j).getKey().equals(key)) {
                value = buckets.get(i).get(j).getValue();
                buckets.get(i).remove();
                break;
            }
        }
        if(value == "") return null;

        return value;
    }

    public boolean containsKey(String key) {
        int i = 0;
        if(key != null) i = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
        for(int j = 0; j<buckets.get(i).size();j++)
            if(buckets.get(i).get(j).getKey().equals(key)) return true;

        return false;
    }

    public boolean containsValue(String value) {
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++){
            for(int j = 0; j<buckets.get(i).size(); j++) {
                if (buckets.get(i).get(j).getValue().equals(value)) return true;
            }}
        return false;
    }

    public int size() {
        // TODO Return the number of the Entry objects stored in all the buckets

        int n = 0;
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++){
            for(int j = 0; j<buckets.get(i).size(); j++) {
                if (buckets.get(i).get(j)!=null)
                    n++;
            }}
        return n;
    }

    public void clear() {
        // TODO Remove all the Entry objects from the bucket list
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++){
            for(int j = 0; j<buckets.get(i).size(); j++) {
                if (buckets.get(i).get(j)!=null)
                    buckets.get(i).remove(j);
            }}
    }

    public Set<MyEntry> entrySet() {
        Set<MyEntry>s = new HashSet<MyEntry>();
        for(int i = 0; i<BUCKET_ARRAY_SIZE; i++){
            for(int j = 0; j<buckets.get(i).size(); j++) {
                s.add(new MyEntry(buckets.get(i).get(j).getKey(),buckets.get(i).get(j).getValue()));
            }}

        return s;
    }

    public boolean isEmpty() {
        // TODO
        return(this.size()==0);

    }

    public static class MyEntry {
        private String key;
        private String value;

        public MyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
