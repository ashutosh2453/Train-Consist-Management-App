import java.util.Scanner;

public class TrainConsistAppUC18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Display bogie IDs
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.print(id + " ");
        }

        // Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Linear Search
        boolean found = false;

        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop when found
            }
        }

        // Result
        if (found) {
            System.out.println("\nBogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("\nBogie ID " + searchKey + " NOT FOUND.");
        }

        System.out.println("\nProgram continues...");
        sc.close();
    }
}