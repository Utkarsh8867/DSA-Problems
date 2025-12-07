
// import java.util.LinkedList;
public class Linkedlist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //create new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //new node next -> head
        newNode.next = head;

        //head -> newNode
        head = newNode;
    }

    public void addLast(int data) {
        //create new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int data, int t) {

        if(t == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < t - 1) {
            temp = head.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void printLinkedlist(Node head) {
        if (head == null) {
            System.out.println("LL is Empty");
        }
        while (head != null) {

            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.addFirst(1);
        ll.addFirst(12);
        ll.addFirst(15);
        ll.addLast(10);

        ll.addLast(10);
        ll.add(25, 2);

        printLinkedlist(head);

    }
}
