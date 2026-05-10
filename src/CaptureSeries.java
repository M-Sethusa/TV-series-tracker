import java.util.Scanner;

public class CaptureSeries {

    // Prompts the user to enter series details and returns a populated Series object
    public static Series captureSeries(Scanner scanner) {
        // Declaration
        String seriesID, seriesName, seriesNumOfEps, seriesAge;

        while (true) {
            // Display capture series title
            Headings.displayCaptureTitle();
            // Capture each field from user input
            System.out.print("Enter the series ID: ");
            seriesID = scanner.nextLine().trim();
            System.out.print("Enter the series name: ");
            seriesName = scanner.nextLine();
            System.out.print("Enter the series age restriction: ");
            seriesAge = scanner.nextLine().trim();
            System.out.print("Enter the number of episodes for " + seriesName + ": ");
            seriesNumOfEps = scanner.nextLine().trim();

            // logic and validation
            try {
                if (seriesID.isBlank() || seriesName.isBlank() || seriesAge.isBlank() || seriesNumOfEps.isBlank()) {
                    System.out.println("Please enter all the required fields.");
                } else if (Integer.parseInt(seriesNumOfEps) <= 0) {
                    System.out.println("Please enter a valid number of episodes.");
                } else if (Integer.parseInt(seriesAge) < 2 || Integer.parseInt(seriesAge) > 18) {
                    System.out.println("Please enter a valid age restriction between 2 and 18.");
                } else {
                    System.out.println("Series captured successfully!😎");
                    System.out.print("Add another series? (y/n): ");
                    String addAnother = scanner.nextLine().trim();
                    if (addAnother.equalsIgnoreCase("n")) {
                        // Create a new Series object using the captured values
                        Series series = new Series(seriesID, seriesName, seriesNumOfEps, seriesAge);
                        // Return the populated Series object to the caller
                        return series;
                    } else {
                        return captureSeries(scanner);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please ensure that age and number of episodes are valid integers.");
                System.out.println("Age restriction: e.g. 2-18");
                System.out.println("Number of episodes: e.g. 10");
            }
        }
    }
}
