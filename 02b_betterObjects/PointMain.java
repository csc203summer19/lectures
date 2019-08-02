public class PointMain
{
    public static void main(String[] args) {
        Point pt1 = new Point(1, 2);
        Point pt2 = new Point(1, 2);
        Point pt3 = new Point(2, 1);

        // Unlike Python, even with the equals method implemented, "==" still
        //  checks reference equality.
        System.out.println("    " + (pt1 == pt2));
        System.out.println("    " + pt1.equals(pt2));

        System.out.println("    " + pt1.equals(pt3));

        System.out.println("    " + pt1);

        // Because variables have types, the compiler can match the argument
        //  types with the parameter types and call the appropriate method.
        System.out.println("    " + pt1.distance(pt2));
        System.out.println("    " + pt1.distance());
    }
}
