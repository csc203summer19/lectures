import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        // The compiler can infer the type parameter on the RHS.
        List<Number> list = new ArrayList<>();

        // All Integers are Numbers, so this list can contain Integers.
        list.add(1);
        list.add(2);

        // This fails to compile; List<Integer> is not a subtype of
        //  List<Number>.
        List<Integer> integerList = new ArrayList<>();
        // List<Number> numberList = integerList;

        // If this were allowed:
        //  * The runtime type of numberList is ArrayList<Integer>
        //  * The compile-time type of numberList is List<Number>
        // Then the compiler would allow us to add doubles to integerList:
        // numberList.add(4.0);

        List<Integer> anotherList = integerList;

        // This fails to compile; one of the limitations on generics is
        //  that they don't work with instanceof
        // integerList instanceof List<Number>;
        System.out.println("    " + integerList.getClass());

        // This works: as long as the type parameter is the same, ArrayList
        //  remains a subtype of List.
        List<Integer> lst1 = new ArrayList<Integer>();

        // This fails to compile: once the type parameter is different, there
        //  is no link between the raw types.
        // List<Number> lst2 = new ArrayList<Integer>();

        // The only common link between these types is Object itself.
        List<Number> lst3 = new ArrayList<Number>();
        List<Integer> lst4 = new ArrayList<Integer>();
        Object lst5 = lst3;
        lst5 = lst4;
    }
}
