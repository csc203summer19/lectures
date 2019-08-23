import java.util.function.Function;

public class Main
{
    public static void main(String[] args) {
        Point myPoint = new Point(1.2, 3.4);

        PointStringifier stringifyPoint =
                pt -> "(" + pt.getX() + ", " + pt.getY() + ")";

        // NOTE: stringifyPoint is a reference whose compile-time type is
        //       PointStringifier and whose runtime type is made up by the
        //       compiler.
        System.out.println("    " + stringifyPoint.stringify(myPoint));

        // The standard library already includes a generic functional interface
        //  for this situation.
        Function<Point, String> stringifyAgain =
                pt -> "This is a point: " + pt;

        System.out.println("    " + stringifyAgain.apply(myPoint));
    }
}
