// Interface
interface Vehicle {
    void start();

    void accelerate();

    void brake();
}

// Car class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }
}

// Motorcycle class
class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking...");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Polymorphism - Treating both vehicles the same way using the interface
        Vehicle[] vehicles = { car, motorcycle };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
            System.out.println();
        }
    }
}
