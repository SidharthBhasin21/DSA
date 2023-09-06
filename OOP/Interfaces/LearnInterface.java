package OOP.Interfaces;

/**
 * LearnInterface
 */
public class LearnInterface {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.walk();
    }

}

/**
 * Animal
 */
interface Animal {

    void eat();

}

interface Human {
    void walk();
}

class Monkey implements Animal, Human {

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}