package Assignment10;

public class LinkedList {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SListIterator iterator = list.getIterator();
        iterator.insertNode(10);
        iterator.insertNode(20);
        iterator.insertNode(30);
        iterator.insertNode(40);
        iterator.insertNode(50);
        iterator.displayList();
        iterator.deleteNode(30);
        iterator.displayList();
    }
}

// Output:
// Singly Linked List are 10->20->30->40->50
// Singly Linked List are 10->20->40->50

