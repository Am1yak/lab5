/**
 * Represents an observer in the Observer pattern that listens for updates.
 * The Follower interface defines a method to receive updates,
 * allowing implementing classes to respond to changes in a subject.
 */
public interface Follower {

    /**
     * Called to provide an update to the follower.
     *
     * @param update the message or data to notify the follower about
     */
    void update(String update);
}
