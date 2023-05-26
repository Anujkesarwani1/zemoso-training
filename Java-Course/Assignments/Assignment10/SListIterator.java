package Assignment10;

public class SListIterator<Type> {
    Node<Type> head, tail;

    public SListIterator(Node<Type> head) {
        this.head = head;
    }

    void insertNode(Type val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
    }

    void deleteNode(Type val) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else if ((head.val).equals(val)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<Type> prev = head;
            Node<Type> ptr = head.next;
            while (ptr != null) {
                if ((ptr.val).equals(val)) {
                    break;
                }
                prev = prev.next;
                ptr = ptr.next;
            }
            if (ptr == null) {
                System.out.println("No Element Found");
                return;
            } else if (ptr == tail) {
                tail = prev;
                tail.next = null;
            } else {
                prev.next = ptr.next;
            }
        }
    }

    void displayList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.print("Singly Linked List are ");
        Node<Type> ptr = head;
        do {
            if (ptr.next != null) {
                System.out.print(ptr.val + "->");
            } else {
                System.out.print(ptr.val + "\n");
            }
            ptr = ptr.next;
        } while (ptr != null);

    }
}

