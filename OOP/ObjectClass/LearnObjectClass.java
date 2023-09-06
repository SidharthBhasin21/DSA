package OOP.ObjectClass;

public class LearnObjectClass {

    public static void main(String[] args) {
        Car honda = new Car("Civic", 2023);
        Car honda2 = new Car("swift", 2023);

        System.out.println(honda.getClass());

    }

}

class Car {

    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car {ka model "
                + model + " hai aur " + year +
                " mai} banni thi";
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        return (car.model == this.model && car.year == this.year);
    }

}