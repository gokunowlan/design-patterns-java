package creational;

public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {
        System.out.println("Singleton Instance Created");
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonExample obj = SingletonExample.getInstance();
        obj.showMessage();
    }
}