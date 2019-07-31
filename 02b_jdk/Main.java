/**
 * Demonstrates use of standard libraries.
 */

// Imports the existing array list definition.
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        // In order to declare an ArrayList, we have to know what type of
        //  values the list will contain.

        // This does not work, because ArrayList must contain objects.
        // ArrayList<int> list = new ArrayList<int>();
        
        // We have to use the wrapper class for integers.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, new Integer(0));
        Integer x = list.get(0);
        System.out.println("    " + x);

        // The compiler will "autobox" primitives for us.
        list.add(1, 1);

        // The compiler will "unbox" objects for us.
        int y = list.get(1);
        System.out.println("    " + y);
    }
}
