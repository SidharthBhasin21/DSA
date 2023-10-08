package Stack.ImplementStackUsingArray;

public class MyStack {

    int top;
    int arr[];

    MyStack() {
        top = -1;
        arr = new int[1000];
    }

    void push(int a) {
        top++;
        arr[top] = a;

    }

    int pop() {
        return top > -1 ? arr[top--] : -1;

    }

    public static void main(String[] args) {

    }
}