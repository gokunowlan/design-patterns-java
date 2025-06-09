package creational;


interface Button {
    void click();
}

class WindowsButton implements Button {
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}

class MacButton implements Button {
    public void click() {
        System.out.println("Mac Button Clicked");
    }
}

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // change to MacFactory for Mac
        Button button = factory.createButton();
        button.click();
    }
}
