import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SubscriptionManager subscriptionManager = new SubscriptionManager();

        while (true) {
            System.out.println("1. Register new subscription");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    subscriptionManager.registerSubscription(scanner);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
