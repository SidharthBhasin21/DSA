package OOP.Abstraction;

public class LearnAbstract {

    Vehicle car = new Car();

}

abstract class Vehicle {

    abstract void brakes();

    abstract void accelerate();
}

class Car extends Vehicle {

    @Override
    void brakes() {

        throw new UnsupportedOperationException("Unimplemented method 'brakes'");
    }

    @Override
    void accelerate() {

        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }

}