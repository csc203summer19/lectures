/**
 * Represents a computer player in a game of Nim.
 */

import java.util.Scanner;

public class GreedyPlayer implements Player, Commenter
{
    private String name;

    public GreedyPlayer(String name) {
        this.name = name;
    }

    public int takeSticks(Pile pile) {
        pile.remove(3);
        return 3;
    }

    public String makeComment() {
        return "I am Batman.";
    }

    public String toString() {
        return name;
    }
}
