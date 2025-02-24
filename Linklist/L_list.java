public class L_list {

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
  public static int size;

  public void addFirst(int data) {
    // step 1 = create new node

    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step2 = newNode next = head
    newNode.next = head;

    // step - newNode next = head
    head = newNode;

  }

  public void addlast(int data) {

    // step 1 = create new node

    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    size++;

    // step 2

    tail.next = newNode;

    // step 3

    tail = newNode;

  }

  public void printL_list() // O(n)
  {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");

  }

  public void add(int idx, int data) {

    if (idx == 0) {
      addFirst(data);
      return;
    }
    size++;
    int i = 0;
    Node newNode = new Node(data);
    Node temp = head;

    while (i < idx - 1) {
      temp = temp.next;
      i++;

    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;

    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean checkPalindrome() {
    if (head == null || head.next == null) {
        return true;
    }

    // Step 1: Find middle node
    Node midNode = findMid(head);

    // Step 2: Reverse second half of the list
    Node prev = null;
    Node curr = midNode;
    Node next;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Step 3: Compare first and second half
    Node right = prev; // This is the head of the reversed second half
    Node left = head;

    boolean isPalindrome = true;
    Node tempRight = right; // Store the head of reversed part for restoring

    while (right != null) {
        if (left.data != right.data) {
            isPalindrome = false;
            break;
        }
        left = left.next;
        right = right.next;
    }

    // Step 4: Restore the list (reverse back the second half)
    prev = null;
    curr = tempRight;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return isPalindrome;
}

public void reverse() {
   Node prev = null;
   Node curr = tail= head;
   Node next;

   while(curr != null){
    next = curr.next;
    curr.next= prev;
    prev = curr;
    curr = next;
   
  }
   head = prev;
  }




  public static void main(String args[]) {
    System.out.println("Hello");
    L_list ll = new L_list();
    ll.printL_list();
    ll.addFirst(2);
    ll.printL_list();
    ll.addFirst(1);
    ll.printL_list();
    ll.addlast(3);
    ll.printL_list();
    ll.addlast(4);
    ll.printL_list();
    ll.add(3, 7);
    ll.printL_list();
    System.out.println(ll.size);
    ll.removeFirst();
    ll.removeFirst();
    ll.removeFirst();
    ll.removeFirst();
    ll.removeFirst();
    ll.printL_list();
    ll.checkPalindrome();
    ll.printL_list();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);

    ll.printL_list();
    System.out.println(ll.checkPalindrome());

    System.out.println(ll.size);
    ll.reverse();
    ll.printL_list();


  }
}
