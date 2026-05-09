import java.util.Scanner;

public class CaptureSeries {

    // Prompts the user to enter series details and returns a populated Series object
    public static Series captureSeries(Scanner scanner) {
        // Declaration
        String seriesID, seriesName, seriesNumOfEps, seriesAge;

        // Display capture series title
        Headings.displayCaptureTitle();
        // Capture each field from user input
        System.out.print("Enter the series ID: ");
        seriesID = scanner.nextLine();
        System.out.print("Enter the series name: ");
        seriesName = scanner.nextLine();
        System.out.print("Enter the series age restriction: ");
        seriesAge = scanner.nextLine();
        System.out.print("Enter the number of episodes for " + seriesName + ": ");
        seriesNumOfEps = scanner.nextLine();

        if (seriesID.isBlank() || seriesName.isBlank() || seriesAge.isBlank() || seriesNumOfEps.isBlank()) {
            System.out.println("Invalid input. All fields are required!");
            if (!Character.isDigit(Integer.parseInt(seriesAge)) && !Character.isDigit(Integer.parseInt(seriesNumOfEps))) {
                System.out.println("Please enter a valid number for age restriction and number of episodes.");
            }
        }
        // Create a new Series object using the captured values
        Series series = new Series(seriesID, seriesName, seriesNumOfEps, seriesAge);

        // Return the populated Series object to the caller
        return series;
    }
}
