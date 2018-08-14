package patternMain;

import shape.Shape;
import shape.ShapeFactory;

public class FactoryPatternDemo {

    private static ShapeFactory shapeFactory = ShapeFactory.getShapeFactory();

    public static void main(String[] args) {
        Shape shapeFactory1 = shapeFactory.getShape("Rectangle");
        shapeFactory1.drow();

        Shape shapeFactory2 = shapeFactory.getShape("Square");
        shapeFactory2.drow();

        Shape shapeFactory3 = shapeFactory.getShape("Cirle");
        shapeFactory3.drow();
    }
}
