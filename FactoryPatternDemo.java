// Product Interface
interface Shape {
    void draw();
}

// Concrete Implementations
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Factory Class
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}

// Usage
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }
}
