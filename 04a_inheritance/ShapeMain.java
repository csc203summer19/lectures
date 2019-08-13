public class ShapeMain
{
    public static void main(String[] args) {
        Square square = new Square(new Point(2.0, 2.0), 1.0);

        System.out.println("    " + square.getTopLeft());
        System.out.println("    " + square.getBottomRight());

        // A Square can be used wherever a Rectangle is expected.
        Rectangle rectangle = square;
        Shape shape = square;

        // A Square can do anything a Rectangle can.
        System.out.println("    " + square.area());
        System.out.println("    " + square.perimeter());

        // Every class inherits methods from the Object class.
        Square square2 = new Square(new Point(2.0, 2.0), 1.0);
        // "square.equals(square)" is the same as "square == square".
        System.out.println("    " + square.equals(square));
        System.out.println("    " + square.equals(square2));
        System.out.println("    " + square);
    }
}
