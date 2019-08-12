// Square inherits all of Rectangle's public fields and methods.
public class Square extends Rectangle
{
    // NOTE: Square is a Rectangle, so a topLeft and bottomRight point still
    //       exist in memory, but they cannot be accessed within Square because
    //       they are private.
    private double width;

    public Square(Point topLeft, double width) {
        // The first line in a subclass's constructor must be a call to the
        //  superclass's constructor, and since Rectangle's constructor takes
        //  arguments, the compiler cannot figure this out automatically.
        super(topLeft, new Point(topLeft.getX() + width,
                                 topLeft.getY() - width)); 
        this.width = width;
    }

    // NOTE: Square does not have to implement area and perimeter in order to
    //       be a Shape; it inherits Rectangle's implementations.

    public double area() {
        System.out.println("    Inside Square.area.");
        double myArea = width * width;
        double superArea = super.area();

        if (myArea == superArea) {
            return myArea;
        }
        else {
            System.out.println("    Something went wrong...");
            return 0;
        }
    }
}
