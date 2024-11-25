/**
 * Represents a user that follows a weather broadcast and receives updates.
 * Implements the {@link Follower} interface to define how the user will
 * handle updates from the broadcast service.
 */
public class FollowerUser implements Follower {

    private String name;

    /**
     * Constructs a new FollowerUser with the specified name.
     *
     * @param name the name of the follower user
     */
    public FollowerUser(String name) {
        this.name = name;
    }

    /**
     * Receives an update and prints it out with the user's name.
     * This method is called when there is a new update from the broadcast.
     *
     * @param update the message or data to notify the follower about
     */
    @Override
    public void update(String update) {
        System.out.println(name + ": " + update);
    }
}
