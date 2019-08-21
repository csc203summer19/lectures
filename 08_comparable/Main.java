import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args) {
        Point pt1 = new Point(1.0, 2.0);
        Point pt2 = new Point(3.0, 1.5);
        Point pt3 = new Point(1.0, -0.25);
        Point pt4 = new Point(3.0, 2.0);

        System.out.println("    pt1.compareTo(pt2): " + pt1.compareTo(pt2));
        System.out.println("    pt2.compareTo(pt1): " + pt2.compareTo(pt1));
        System.out.println("    pt1.compareTo(pt3): " + pt1.compareTo(pt3));

        Comparator<Point> compareByY = new PointComparator();

        System.out.println("    compare(pt1, pt2): "
                           + compareByY.compare(pt1, pt2));
        System.out.println("    compare(pt3, pt2): "
                           + compareByY.compare(pt3, pt2));
        System.out.println("    compare(pt1, pt4): "
                           + compareByY.compare(pt1, pt4));

        Comparator<Point> compareByX = Comparator.naturalOrder();

        System.out.println("    compare(pt1, pt2): "
                           + compareByX.compare(pt1, pt2));
        System.out.println("    compare(pt2, pt1): "
                           + compareByX.compare(pt2, pt1));
        System.out.println("    compare(pt1, pt3): "
                           + compareByX.compare(pt1, pt3));

        Comparator<Point> reversedByY = new PointComparator().reversed();

        System.out.println("    compare(pt1, pt2): "
                           + reversedByY.compare(pt1, pt2));
        System.out.println("    compare(pt3, pt2): "
                           + reversedByY.compare(pt3, pt2));
        System.out.println("    compare(pt1, pt4): "
                           + reversedByY.compare(pt1, pt4));

        Comparator<Point> compareByXthenY =
                compareByX.thenComparing(compareByY);

        System.out.println("    compare(pt1, pt2): "
                           + compareByXthenY.compare(pt1, pt2));
        System.out.println("    compare(pt1, pt3): "
                           + compareByXthenY.compare(pt1, pt3));

        List<Point> points = new ArrayList<>();
        points.add(pt1);
        points.add(pt2);
        points.add(pt3);
        points.add(pt4);

        points.sort(null);
        System.out.println("    " + points);

        points.sort(new PointComparator());
        System.out.println("    " + points);

        points.sort(compareByXthenY);
        System.out.println("    " + points);
    }
}
