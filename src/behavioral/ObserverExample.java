package behavioral;


import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

class Publisher {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer o) {
        observers.add(o);
    }

    void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        Publisher news = new Publisher();
        news.addObserver(new Subscriber("Alice"));
        news.addObserver(new Subscriber("Bob"));

        news.notifyObservers("New Java Release!");
    }
}
