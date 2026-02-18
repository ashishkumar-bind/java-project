
abstract class Vehicle{
    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("car start with key");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("bike start with kick");
    }
}

public class AbstractOOPs {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
    }
}
