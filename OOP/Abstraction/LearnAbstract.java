package OOP.Abstraction;

public class LearnAbstract {

    // Vehicle car = new Vehicle();

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }

}