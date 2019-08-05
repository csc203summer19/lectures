import java.util.ArrayList;

public class ShapeMain
{
    public static void main(String[] args) {
        // Declares a reference to a shape.
        Shape shape;

        // This is illegal; interfaces cannot be instantiated.
        // shape = new Shape();
        
        // On the right hand side, a value of type Shape is expected.
        // shape = _?_;
        
        // Because Circle is a subtype of Shape, a Circle may be used where a
        //  Shape is expected.
        shape = new Circle(new Point(0, 0), 1.0);

        // We don't know how "perimeter" is implemented, but we do know it
        //  must exist.
        System.out.println("    " + shape.perimeter());

        // This does not compile. The compiler does not know that "shape"
        //  is actually a Circle. It only knows that it is a Shape, and
        //  Shapes do not have a "getCenter".
        // The runtime type of "shape" is, in fact, Circle, but the
        //  compile-time type is Shape.
        // System.out.println("    " + shape.getCenter());
        
        // The compiler automatically upcasts the Circle on the RHS into
        //  a Shape to match the LHS. This will always work.
        shape = new Circle(new Point(1, 1), 2);
        // Equivalent to:
        shape = (Shape)(new Circle(new Point(1, 1), 2));

        // We must explicitly downcast the Shape into a Circle.
        System.out.println("    " + ((Circle)shape).getCenter());

        // Rectangles are also Shapes:
        Shape shape2 = new Rectangle(new Point(0, 1), new Point(1, 0));
        System.out.println("    " + shape2.perimeter());

        // This compiles -- the compile-time type of "shape2" is Shape, and
        //  it is possible that a Shape is actually a Circle.
        // This fails at runtime -- the runtime type of "shape2" is Rectangle,
        //  and Rectangles are not Circles.
        // System.out.println("    " + ((Circle)shape2).getCenter());

        // Suppose we want a collection of both Circles and Rectangles.
        //  Without interfaces, we would need two separate lists:
        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        // We cannot put Circles into a list of Rectangles, and vice versa.
        
        // With interfaces, we can use a single list:
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(shape);
        shapes.add(shape2);

        System.out.println("    " + shapes.get(0).area());
        System.out.println("    " + shapes.get(1).area());
    }
}
