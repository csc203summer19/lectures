/**
 * Runs a game of Nim.
 */

import java.util.Scanner;

public class Nim
{
    public static void main(String[] args) {
        Pile pile;
        HumanPlayer human;
        ComputerPlayer computer;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        human = new HumanPlayer(scanner.next());
        computer = new ComputerPlayer("Super Chris");

        System.out.print("How many sticks are in the pile? ");
        pile = new Pile(scanner.nextInt());

        while (pile.getSticksLeft() > 0) {
            int taken = human.takeSticks(pile);
            System.out.println(human + " took " + taken + " sticks.");
            System.out.println("There are " + pile.getSticksLeft()
                               + " sticks left in the pile.");

            if (pile.getSticksLeft() == 0) {
                System.out.println(computer + " wins!");
                break;
            }

            taken = computer.takeSticks(pile);
            System.out.println(computer + " took " + taken + " sticks.");
            System.out.println("There are " + pile.getSticksLeft()
                               + " sticks left in the pile.");

            if (pile.getSticksLeft() == 0) {
                System.out.println(human + " wins!");
                break;
            }
        }
    }
}
