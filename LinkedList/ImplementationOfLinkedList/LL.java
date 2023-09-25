package LinkedList.ImplementationOfLinkedList;

/**
 * LL
 */
public class LL {

    public static void main(String[] args) {
        Node<Integer> n0 = new Node(2);
        Node<Integer> n1 = new Node(4);
        Node<Integer> n2 = new Node(7);
        Node<Integer> n3 = new Node(9);
        Node<Integer> n4 = new Node(1);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printLL(n0);

    }

    public static void printLL(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

class Node<E> {
    E val;
    Node<E> next;

    public Node(E val) {
        this.val = val;
        this.next = null;
    }

    public Node(E val, Node<E> next) {
        this.val = val;
        this.next = next;
    }
}