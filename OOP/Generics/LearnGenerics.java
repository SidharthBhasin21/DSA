package OOP.Generics;

public class LearnGenerics {

    public static void main(String[] args) {

        Abc<String> v = new Abc<>("Sid");
        Abc<Integer> t = new Abc<>(12);

        v.print();
        t.print();

    }

}

class Abc<T> {

    T data;

    public Abc(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println(this.data);
    }

}