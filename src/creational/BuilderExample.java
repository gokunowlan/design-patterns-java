package creational;

class Computer {
    private String CPU;
    private String RAM;

    public static class Builder {
        private String CPU;
        private String RAM;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
    }

    public void showSpecs() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM);
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder().setCPU("Intel").setRAM("16GB").build();
        pc.showSpecs();
    }
}
