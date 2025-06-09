package structural;


interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class RedShapeDecorator implements Shape {
    private Shape decoratedShape;

    RedShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
    }
}
