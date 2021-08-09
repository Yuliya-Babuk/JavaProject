package lesson4;

public class PerimeterAndSquareCalculation {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);
        RectangleAction rectangleAction = new RectangleAction();
        System.out.println(rectangle.getClass().getName() + "\nPerimeter: " + rectangleAction.computePerimeter(rectangle) + "\nSquare: "
                + rectangleAction.computeSquare(rectangle));
        Triangle triangle = new Triangle(3, 4, 5);
        TriangleAction triangleAction = new TriangleAction();
        System.out.println(triangle.getClass().getName() + "\nPerimeter: " + triangleAction.computePerimeter(triangle) + "\nSquare: "
                + triangleAction.computeSquare(triangle));

    }
}

interface ShapeAction {
    double computePerimeter(AbstractShape abstractShape);

    double computeSquare(AbstractShape abstractShape);
}

class AbstractShape {
    private long sideA;
    private long sideB;

    public long getSideA() {
        return sideA;
    }

    public void setSideA(long sideA) {
        this.sideA = sideA;
    }

    public long getSideB() {
        return sideB;
    }

    public void setSideB(long sideB) {
        this.sideB = sideB;
    }

    AbstractShape(long sideA, long sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
}

class RectangleAction implements ShapeAction {
    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof Rectangle rectangle) {
            square = rectangle.getSideA() * rectangle.getSideB();
        } else {
            throw new IllegalArgumentException("Incompatible shape " +
                    shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter;
        if (shape instanceof Rectangle rectangle) {
            perimeter = 2 * (rectangle.getSideA()
                    + rectangle.getSideB());
        } else {
            throw new IllegalArgumentException("Incompatible shape "
                    + shape.getClass());
        }
        return perimeter;
    }
}

class TriangleAction implements ShapeAction {
    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof Triangle triangle) {
            square = triangle.getSideA() * triangle.getSideB();
        } else {
            throw new IllegalArgumentException("Incompatible shape " +
                    shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter;
        if (shape instanceof Triangle triangle) {
            double a = triangle.getSideA();
            double b = triangle.getSideB();
            double c = triangle.getSideC();
            perimeter = a + b + c;
        } else {
            throw new IllegalArgumentException("Incompatible shape "
                    + shape.getClass());
        }
        return perimeter;
    }
}

class Rectangle extends AbstractShape {
    Rectangle(long sideA, long sideB) {
        super(sideA, sideB);
    }
}

class Triangle extends AbstractShape {
    private long sideC;

    public long getSideC() {
        return sideC;
    }

    public void setSideC(long sideC) {
        this.sideC = sideC;
    }

    Triangle(long sideA, long sideB, long sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }
}
