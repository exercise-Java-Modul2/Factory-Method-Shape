package shape;

public class ShapeFactory {

    private static ShapeFactory shapeFactory = new ShapeFactory();

    public static ShapeFactory getShapeFactory() {
        return shapeFactory;
    }
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("Cirle")) {
            return new Cirle();
        } else {
            return null;
        }
    }
}
