package OOP.LearnClasses;

/**
 * ClassesTut
 */
public class ClassesTut {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "SSS";
        dog1.bark();

    }
}

class Dog {
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name + " can walk");
    }

    void abc(String ac) {

        System.out.println("NEW OBJECT");

    }

    int abc(int b) {
        return 0;
    }

    void bark() {
        System.out.println(name + " can bark");
    }
}

class cat {

}