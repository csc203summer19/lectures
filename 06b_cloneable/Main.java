import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Point pt1 = new Point(1.0, 2.0);
        Point pt2 = pt1.clone();

        pt2.setX(3.0);
        System.out.println("    pt1: " + pt1);
        System.out.println("    pt2: " + pt2);

        Circle circle1 = new Circle(pt1, 3.0);
        Circle circle2 = circle1.clone();

        circle2.getCenter().setX(0.0);
        circle2.setRadius(4.0);
        System.out.println("    circle1: " + circle1);
        System.out.println("    circle2: " + circle2);
    }
}
