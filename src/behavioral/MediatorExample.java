package behavioral;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Don't send message back to sender
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}

// Colleague (User)
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message);
}

// Concrete User
class ConcreteUser extends User {
    public ConcreteUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }
}

// Main class
public class MediatorExample {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User user1 = new ConcreteUser(chat, "Alice");
        User user2 = new ConcreteUser(chat, "Bob");
        User user3 = new ConcreteUser(chat, "Charlie");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Hello everyone!");
    }
}

