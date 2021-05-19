import java.util.HashMap;
import java.util.Set;


public class HashMapFun {
    public static void main(String[] args) {
        // On the Java platform, sets of key-value pairs are stored in what we call "Maps." The "Map" type is implemented in a few different ways, the primary of which are HashMaps.
        // These allow you to store sets of key value pairs, but does not have any order, even if you iterate over it!

        // Create the HashMap
        HashMap<String, String> userMap = new HashMap<String, String>(); 

        // Put the key-value pairs into the HashMap
        userMap.put("nninja@cd.com", "Nancy Ninja");
        userMap.put("ssamurai@cd.com", "Sam Samurai"); 
        userMap.put("wwizard@cd.com", "Walter Wizard");

        // Get them out
        String name = userMap.get("nninja@cd.com"); 
        System.out.println("The full name is: " + name); // The full name is Nancy Ninja

        // Iterate over a HashMap
        // Get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + userMap.get(key));
        }

        // A Set is an interface and is a collection that contains no duplicates.  The keySet method returns a set of all the keys in the map then in the for-loop we iterate over the set, print the keys, and get the value associated with the key" 

        // Some of the most commonly used methods in HashMaps are clear, containsKey, containsValue, isEmpty, keySet, remove, replace, size, values
    }
}
