import java.util.ArrayList;
import java.util.List;

/**
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist (empty list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
    }
}