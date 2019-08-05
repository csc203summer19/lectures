/**
 * Represents a human player in a game of Nim.
 */

import java.util.Scanner;

public class HumanPlayer
{
    private String name;

    public HumanPlayer(String name) {
        this.name = name;
    }

    public int takeSticks(Pile pile) {
        // Make a new scanner to read user input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sticks will you take [1, 3]? ");
        int taken = scanner.nextInt();

        pile.remove(taken);
        return taken;
    }

    public String toString() {
        return name;
    }
}
