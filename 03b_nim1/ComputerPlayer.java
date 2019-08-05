/**
 * Represents a computer player in a game of Nim.
 */

import java.util.Scanner;

public class ComputerPlayer
{
    private String name;

    public ComputerPlayer(String name) {
        this.name = name;
    }

    public int takeSticks(Pile pile) {
        pile.remove(1);
        return 1;
    }

    public String toString() {
        return name;
    }
}
