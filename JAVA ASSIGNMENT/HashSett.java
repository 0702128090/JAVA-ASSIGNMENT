
import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();

        // Adding elements
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate, will not be added

        // Displaying elements
        System.out.println("Unique names: " + uniqueNames); // Output: [Alice, Bob]
    }
}