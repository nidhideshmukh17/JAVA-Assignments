interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}

interface ShapeFactory {
    Shape createShape(String shapeType);
}

class ShapeFactoryInterface implements ShapeFactory {
    @Override
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactoryInterface();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}