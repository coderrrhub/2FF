package Lecture21;

public class CircularLL {
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
        }
    }

    private Node head, tail;
    private int size;
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public void insertAtLast(String data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // T.C.:- O(1)
    public int length() {
        return size;
    }

    // T.C.:- O(N)
    public int length1() {
        if (head == null) {
            return 0;
        }

        Node temp = head;
        int count = 0;

        while (temp.next != head) {
            count++;
            temp = temp.next;
        }

        // count the last node
        count++;

        return count;
    }

    public String deleteAtFirst() {
        if(head == null) {
            return "No data to be deleted"; // Exception throw
        }

        size--;

        String deletedValue = head.data;
        if(head.next == head) {
            head = null;
            tail = null;
            return deletedValue;
        }
        tail.next = head.next;
        head = head.next;
        return deletedValue;
    }

    public String deleteAtLast() {
         if(head == null) {
            return "No data to be deleted"; // Exception throw
        }

        size--;

        if(head.next == head) {
            // only single node
            String deletedValue = head.data;
            head = null;
            tail = null;
            return deletedValue;
        }

        // atleast 2 Nodes
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }

        String deletedValue = tail.data;
        temp.next = head;
        tail = temp;

        return deletedValue;
    }


    public void display() {
        if(head == null) return;
        Node temp = head;
        while(temp.next != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println(temp.data); // for the last node to print

    }

    public static void main(String[] args) {
        CircularLL obj = new CircularLL ();
        // System.out.println(obj.deleteAtFirst());
        obj.insertAtFirst("Raj");
        obj.insertAtLast("Rahul");
        obj.insertAtFirst("Rohit");
        obj.insertAtLast("Mohit");
        // obj.display();
        // System.out.println(obj.deleteAtFirst());
        // System.out.println(obj.deleteAtLast());
        obj.display();
        // System.out.println("The Deleted Value "+obj.deleteAtLast());
        System.out.println(obj.length());
    }
}
