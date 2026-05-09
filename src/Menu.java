import java.util.Scanner;

public class Menu {

    // Display menu items
    public static void menuItems(Scanner scanner) {
        // Declaration
        String item;

        Headings.displayHomeTitle();
        while (true) {
            System.out.println("Please select one of the following menu items:");
            System.out.println("1. Capture a new series");
            System.out.println("2. Search for a series");
            System.out.println("3. Update age restriction");
            System.out.println("4. Delete a series");
            System.out.println("5. Print series report");
            System.out.println("6. Exit");
            System.out.print("> ");
            item = scanner.nextLine();

            try {
                switch (Integer.parseInt(item)) {   // converts string to an integer
                    case 1:
                        CaptureSeries.captureSeries(scanner);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.out.println("\nGoodbye!😁");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        System.out.println("e.g. [1-6]\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                System.out.println("e.g. [1-6]\n");
            }
        }
    }
}

