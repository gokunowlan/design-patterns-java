package structural;


class CPU {
    void start() {
        System.out.println("CPU started");
    }
}

class Memory {
    void load() {
        System.out.println("Memory loaded");
    }
}

class Disk {
    void spin() {
        System.out.println("Disk spinning");
    }
}

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    void startComputer() {
        cpu.start();
        memory.load();
        disk.spin();
        System.out.println("Computer started successfully");
    }
}

public class FacadeExample {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
