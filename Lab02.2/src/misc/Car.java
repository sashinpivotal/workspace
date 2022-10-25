package misc;

public class Car {
    private String model;
    private int age;
    private Engine engine;
    private Transmission transmission;

    public Car(String model, Engine engine, Transmission transmission, int age) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.age = age;
    }

    public void someMethodInCarClass() {
        engine.rev();
        Engine.myEngineStaticMethod();
    }
}

class Main {
    public static void main(String[] args) {
        Car whatever = new Car("whatever", new Engine(), new Transmission(), 50);
    }
}
