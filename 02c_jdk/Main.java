/**
 * Demonstrates use of standard libraries.
 */

// Imports the existing array list definition.
import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args) {
        // This does not work, because in order to declare an ArrayList, we
        //  have to know what type of values the list will contain.
        // ArrayList list = new ArrayList();

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


        // When creating a HashMap, we must specify both the type of the
        //  keys and that of the values.
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Christopher", 10);
        map.put("Jon", 10);
        map.put("Caleb", 5);
        map.put("Andrew", 1);

        System.out.println("    " + map.get("Jon"));
    }
}
