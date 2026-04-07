import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistAppUC19 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs (IMPORTANT for Binary Search)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Display bogie IDs
        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Binary Search logic
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIDs[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Result
        if (found) {
            System.out.println("\nBogie ID " + key + " FOUND in the train.");
        } else {
            System.out.println("\nBogie ID " + key + " NOT FOUND.");
        }

        System.out.println("\nProgram continues...");
        sc.close();
    }
}