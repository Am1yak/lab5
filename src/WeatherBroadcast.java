/**
 * Represents a weather broadcasting service in the Observer pattern.
 * The WeatherBroadcast interface allows followers to subscribe to or
 * unsubscribe from weather updates, and notifies all subscribed followers
 * when there is a new update.
 */
public interface WeatherBroadcast {

    /**
     * Adds a follower to the list of subscribers for weather updates.
     *
     * @param follower the follower that wants to receive updates
     */
    void follow(Follower follower);

    /**
     * Removes a follower from the list of subscribers, stopping them from
     * receiving future updates.
     *
     * @param follower the follower that no longer wants to receive updates
     */
    void unfollow(Follower follower);

    /**
     * Notifies all subscribed followers with a new update.
     *
     * @param update the weather update message to send to all followers
     */
    void notifyFollowers(String update);
}
