import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Headings.displayHomeTitle();

        if (!StartUp.startApp(scanner)) {
            System.exit(0);
        }
        Menu.menuItems(scanner);
    }
}