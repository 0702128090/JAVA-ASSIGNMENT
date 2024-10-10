
import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);

        // Accessing elements
        System.out.println("Alice's age: " + ageMap.get("Alice")); // Output: 30

        // Displaying the entire map
        System.out.println("Age map: " + ageMap);
    }
}
