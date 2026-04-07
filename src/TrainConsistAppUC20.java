import java.util.ArrayList;
import java.util.List;

public class TrainConsistAppUC20 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list (empty scenario)
        List<String> bogieIDs = new ArrayList<>();

        // Try searching for a bogie
        try {
            searchBogie(bogieIDs, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    // Search method with defensive check
    public static void searchBogie(List<String> bogies, String key) {

        // Defensive Programming: check state first
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Train consist is empty. Cannot perform search operation.");
        }

        // Linear search logic
        boolean found = false;

        for (String id : bogies) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + key + " FOUND.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }
    }
}