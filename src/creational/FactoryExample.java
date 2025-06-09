package creational;


interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog: Woof!");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat: Meow!");
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog"))
            return new Dog();
        else if (type.equalsIgnoreCase("cat"))
            return new Cat();
        return null;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("dog");
        a1.sound();
        Animal a2 = AnimalFactory.getAnimal("cat");
        a2.sound();
    }
}
