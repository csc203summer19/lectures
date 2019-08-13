public class Rectangle implements Shape
{
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public double area() {
        System.out.println("    Inside Rectangle.area.");
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();

        return width * height;
    }

    public double perimeter() {
        System.out.println("    Inside Rectangle.perimeter.");
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();

        return 2 * width + 2 * height;
    }
}
