package Lecture24;

public class DoublyLL {
    class Node {
        String data;
        Node next, prev;
        Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if(head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(String data) {
        Node newNode = new Node(data);
        size++;
        // not a single node ----> head = null
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // T.C.:- O(1)
    public int length() {
        return size;
    }

    // T.C.:- O(N)
    public int length1() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    public String deleteAtFirst() {
        if(head == null) {
            return "No data to be deleted"; // Exception throw
        }

        size--;

        String deletedValue = head.data;
        if(head.next == null) {
            head = null;
            return deletedValue;
        }
        head = head.next;
        head.prev = null;
        return deletedValue;
    }

    public String deleteAtLast() {
         if(head == null) {
            return "No data to be deleted"; // Exception throw
        }

        size--;

        if(head.next == null) {
            // only single node
            String deletedValue = head.data;
            head = null;
            return deletedValue;
        }

        // atleast 2 Nodes
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        String deletedValue = temp.next.data;
        temp.next.prev = null; // optional cleanup
        temp.next = null;

        return deletedValue;
    }


    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        // System.out.println(obj.deleteAtFirst());
        obj.insertAtFirst("Raj");
        obj.insertAtLast("Rahul");
        obj.insertAtFirst("Rohit");
        obj.insertAtLast("Mohit");
        obj.display();
        System.out.println(obj.deleteAtFirst());
        obj.display();
        // System.out.println("The Deleted Value "+obj.deleteAtLast());
        System.out.println(obj.length());
    }
}
