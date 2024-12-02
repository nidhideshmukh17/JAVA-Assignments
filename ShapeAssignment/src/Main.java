public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        Circle c = new Circle(5.0F);
        Square s = new Square(4.0F);

        shapes[0] = c;
        shapes[1] = new Shape();

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Square Area: " + s.calculateArea());

        Geometry g = new Geometry();
        Geometry.Point p = g.new Point(3, 4);
        p.display();
    }
}
