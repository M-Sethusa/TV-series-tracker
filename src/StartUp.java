import java.util.Scanner;

public class StartUp {

    // return true if user chooses to start application, false otherwise
    public static boolean startApp(Scanner scanner) {
        // Declaration
        // User input
        System.out.println("Press (1) to start application or any other key to exit");
        String start = scanner.nextLine().trim();

        if (start.equals("1")) {
            System.out.println("Starting application...");
            return true;
        } else {
            System.out.println("\nClosing application");
            System.out.println("Goodbye!😎");
            return false;
        }

    }
}
