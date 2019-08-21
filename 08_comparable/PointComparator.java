import java.util.Comparator;

public class PointComparator implements Comparator<Point>
{
    /**
     * Compares points by y-coordinate, ascending.
     */
    public int compare(Point pt1, Point pt2) {
        if (pt1.getY() < pt2.getY()) {
            return -1;
        }
        else if(pt1.getY() == pt2.getY()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
