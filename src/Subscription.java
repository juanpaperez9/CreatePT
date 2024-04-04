public class Subscription {
    private String firstName;
    private String lastName;
    private int stratum;
    private String subscriptionType;
    private int subscriptionTime;
    private int welcomePoints;
    private int accumulatedPoints;

    public Subscription(String firstName, String lastName, int stratum, String subscriptionType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stratum = stratum;
        this.subscriptionType = subscriptionType;
        // Additional initialization if needed
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStratum() {
        return stratum;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public int getSubscriptionTime() {
        return subscriptionTime;
    }

    public int getWelcomePoints() {
        return welcomePoints;
    }

    public int getAccumulatedPoints() {
        return accumulatedPoints;
    }
}
