/**
 * Runs a game of Nim.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Nim
{
    public static void main(String[] args) {
        Pile pile;
        ArrayList<Player> players = new ArrayList<Player>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many human players are there? ");
        int numHumans = scanner.nextInt();
        for (int i = 0; i < numHumans; i++) {
            System.out.print("Player " + i + ", what is your name? ");
            players.add(new HumanPlayer(scanner.next()));
        }

        players.add(new NaivePlayer("Elan Sleazebaggano"));
        players.add(new GreedyPlayer("Batman"));

        System.out.print("How many sticks are in the pile? ");
        pile = new Pile(scanner.nextInt());

        int i = 0;
        while (true) {
            Player player = players.get(i);

            int taken = player.takeSticks(pile);
            System.out.println(player + " took " + taken + " sticks.");
            System.out.println("There are " + pile.getSticksLeft()
                               + " sticks left in the pile.");

            if (player instanceof ComputerPlayer) {
                System.out.println(player + ": \""
                                   + ((ComputerPlayer)player).makeComment()
                                   + "\"");
            }

            if (pile.getSticksLeft() == 0) {
                System.out.println(player + " loses!");
                break;
            }
            else {
                i = (i + 1) % players.size();
            }
        }
    }
}
