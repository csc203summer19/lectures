/**
 * Represents a pile of sticks in a game of Nim.
 */

public class Pile
{
    // We have made sticksLeft private so that we can control exactly how
    //  players may change its value.
    private int sticksLeft;

    public Pile(int sticksLeft) {
        this.sticksLeft = sticksLeft;
    }

    public int getSticksLeft() {
        return sticksLeft;
    }

    public int remove(int numSticks) {
        sticksLeft = Math.max(sticksLeft - numSticks, 0);
        return sticksLeft;
    }
}
