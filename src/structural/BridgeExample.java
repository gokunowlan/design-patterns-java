package structural;


interface Color {
    String applyColor();
}

class Red implements Color {
    public String applyColor() {
        return "Red";
    }
}

class Green implements Color {
    public String applyColor() {
        return "Green";
    }
}

abstract class ShapeBridge {
    protected Color color;

    ShapeBridge(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class CircleBridge extends ShapeBridge {
    CircleBridge(Color color) {
        super(color);
    }

    void draw() {
        System.out.println("Drawing Circle with color: " + color.applyColor());
    }
}

public class BridgeExample {
    public static void main(String[] args) {
        ShapeBridge shape = new CircleBridge(new Red());
        shape.draw();
    }
}

