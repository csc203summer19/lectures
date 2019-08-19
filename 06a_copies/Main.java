import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        List<Point> list1 = new ArrayList<>();
        list1.add(new Point(1, 2));

        // This is a reference copy; list1 and list2 are references to the
        //  same object. Modifying list2 also modifies list1.
        List<Point> list2 = list1;
        list2.add(new Point(3, 4));

        System.out.println("    list1: " + list1);
        System.out.println("    list2: " + list2);


        // This is a shallow copy; list1 and list3 are references to different
        //  objects, but those lists contain references to the same objects.
        List<Point> list3 = new ArrayList<>();
        for (Point pt : list1) {
            list3.add(pt);
        }

        list3.add(new Point(5, 6));
        list3.get(0).setX(0);

        System.out.println("    list1: " + list1);
        System.out.println("    list3: " + list3);


        // This is a deep copy; list1 and list4 are references to different
        //  objects, and those lists contain references to different objects.
        List<Point> list4 = new ArrayList<>();
        for (Point pt : list1) {
            list4.add(new Point(pt.getX(), pt.getY()));
        }

        list4.add(new Point(7, 8));
        list4.get(0).setY(0);

        System.out.println("    list1: " + list1);
        System.out.println("    list4: " + list4);
    }
}
