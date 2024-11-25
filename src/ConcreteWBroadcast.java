import java.util.ArrayList;
import java.util.List;

/**
 * A concrete implementation of the {@link WeatherBroadcast} interface.
 * Manages a list of followers and provides functionality for adding,
 * removing, and notifying followers with updates.
 */
public class ConcreteWBroadcast implements WeatherBroadcast {

    private List<Follower> followers = new ArrayList<Follower>();

    /**
     * Adds a follower to the list of subscribers for updates.
     *
     * @param follower the follower that wants to receive updates
     */
    @Override
    public void follow(Follower follower) {
        followers.add(follower);
    }

    /**
     * Removes a follower from the list of subscribers, stopping them from
     * receiving future updates.
     *
     * @param follower the follower that no longer wants to receive updates
     */
    @Override
    public void unfollow(Follower follower) {
        followers.remove(follower);
    }

    /**
     * Notifies all subscribed followers with a new update.
     * Each follower's {@code update} method is called with the update message.
     *
     * @param update the message or data to notify all followers about
     */
    @Override
    public void notifyFollowers(String update) {
        for (Follower follower : followers) {
            follower.update(update);
        }
    }
}
