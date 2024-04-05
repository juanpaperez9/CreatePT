import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubscriptionManager {
    private static final float BASE_SUBSCRIPTION_RATE = 299;
    private static final float TAX_RATE = 1.19f;
    private List<Subscription> subscriptions;

    public SubscriptionManager() {
        this.subscriptions = new ArrayList<>();
    }

    public void registerSubscription(Scanner scanner) {
        System.out.println("Register new subscription");
        System.out.print("Enter customer's first name: ");
        String firstName = scanner.next();
        System.out.print("Enter customer's last name: ");
        String lastName = scanner.next();
        System.out.print("Enter customer's stratum (1-6): ");
        int stratum = scanner.nextInt();
        System.out.print("Enter subscription type (CF, DA, CO, E): ");
        String subscriptionType = scanner.next();

        Subscription subscription = new Subscription(firstName, lastName, stratum, subscriptionType);
        subscriptions.add(subscription);

        displaySummary(subscription);
    }

    private void displaySummary(Subscription subscription) {
        System.out.println("Subscription summary:");
        System.out.println("Customer: " + subscription.getFirstName() + " " + subscription.getLastName());
        System.out.println("Subscription type: " + subscription.getSubscriptionType());
        System.out.println("Duration: " + subscription.getSubscriptionDuration() + " months");
        System.out.println("Accumulated points: " + subscription.getAccumulatedPoints());

        float subtotal = calculateSubtotal(subscription);
        float total = subtotal * TAX_RATE;

        System.out.println("Subtotal before tax: " + subtotal);
        System.out.println("Total to pay with tax: " + total);
        System.out.println("Value applied in the discount: " + (BASE_SUBSCRIPTION_RATE - subtotal));
    }

    private float calculateSubtotal(Subscription subscription) {
        float rate = BASE_SUBSCRIPTION_RATE;
        float discount = 0;

        if (subscription.getSubscriptionType().equalsIgnoreCase("CF")) {
            if (subscription.getStratum() == 1 || subscription.getStratum() == 2) {
                discount += 0.10 * rate;
            }
        } else if (subscription.getSubscriptionType().equalsIgnoreCase("DA")) {
            if (subscription.getStratum() == 1 || subscription.getStratum() == 2) {
                discount += 0.10 * rate;
            }
        }

        return rate - discount;
    }
}
