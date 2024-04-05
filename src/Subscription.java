public class Subscription {
    private String firstName;
    private String lastName;
    private int stratum;
    private String subscriptionType;
    private int subscriptionTime;
    private int welcomePoints;
    private int accumulatedPoints;
    private int subscriptionDuration; // Added field for subscription duration


    public Subscription(String firstName, String lastName, int stratum, String subscriptionType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stratum = stratum;
        this.subscriptionType = subscriptionType;
        this.accumulatedPoints = 50;
        setSubscriptionDuration(); 
        
    }
    // getter and setter methods
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
    
    public int getSubscriptionDuration() {
        return subscriptionDuration;
    }
    
    private void setSubscriptionDuration() {
        switch (subscriptionType.toUpperCase()) {
            case "CF":
                subscriptionDuration = 3;
                break;
            case "DA":
                subscriptionDuration = 6;
                break;
            case "CO":
                subscriptionDuration = 9;
                break;
            case "E":
                subscriptionDuration = 12;
                break;
            default:
                subscriptionDuration = 0; // Default duration if subscription type is invalid
        }
    }
}
