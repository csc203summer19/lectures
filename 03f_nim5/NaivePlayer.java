/**
 * Represents a computer player in a game of Nim.
 */

import java.util.Scanner;

public class NaivePlayer implements Player, Commenter
{
    private String name;

    public NaivePlayer(String name) {
        this.name = name;
    }

    public int takeSticks(Pile pile) {
        pile.remove(1);
        return 1;
    }

    public String makeComment() {
        return "Wanna buy some death sticks?";
    }

    public String toString() {
        return name;
    }
}
