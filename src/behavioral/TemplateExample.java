package behavioral;


abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

class Football extends Game {
    void initialize() {
        System.out.println("Football Game Initialized!");
    }

    void startPlay() {
        System.out.println("Football Game Started!");
    }

    void endPlay() {
        System.out.println("Football Game Ended!");
    }
}

public class TemplateExample {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
    }
}
