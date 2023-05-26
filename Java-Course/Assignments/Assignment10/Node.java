package Assignment10;

public class Node<Type> {
    Type val;
    Node<Type> next;

    Node() {
        this.val = null;
        this.next = null;
    }

    Node(Type val) {
        this.val = val;
        this.next = null;
    }
}

