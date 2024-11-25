/**
 * Demonstrates the Observer pattern using the weather broadcast system.
 * Creates a concrete weather broadcast and multiple followers, simulates
 * broadcasting updates, and shows how followers can subscribe and unsubscribe.
 */
class Main {

    /**
     * The main method to run the demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ConcreteWBroadcast WBroadcast = new ConcreteWBroadcast();

        // Creating followers and subscribing them to the weather broadcast
        FollowerUser follower1 = new FollowerUser("Roland");
        WBroadcast.follow(follower1);

        FollowerUser follower2 = new FollowerUser("Jane Doe");
        WBroadcast.follow(follower2);

        FollowerUser follower3 = new FollowerUser("Till");
        WBroadcast.follow(follower3);

        FollowerUser follower4 = new FollowerUser("Akiyama Mizuki");
        WBroadcast.follow(follower4);

        // Notifying all followers with an update
        WBroadcast.notifyFollowers("The temperature dropped below zero");

        // Unsubscribing one follower and sending another update
        WBroadcast.unfollow(follower3);
        WBroadcast.notifyFollowers("It's started raining");
    }
}
