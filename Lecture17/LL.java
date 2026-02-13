package Lecture17;

public class LL {
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        size++;
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
    }

    public void insertAtAnyPosition(String data, int pos) {
        int len = length();
        if(pos <= 0 || pos > len + 1) {
            return;
        }
        if(pos == 1) {
            insertAtFirst(data);
        } else if(pos == len + 1) {
            insertAtLast(data); // insertAtLast
        } else {
            pos = pos - 2;
            Node newNode = new Node(data);
            Node temp = head;
            while(pos > 0) {
                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
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

        String deletedValue = head.data;
        head = head.next;
        size--;
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
        temp.next = null;

        return deletedValue;
    }

    public String deletedAtAnyPosition(int pos) {
         int len = length();
        if(pos <= 0 || pos > len) {
            return "No Data To be Deleted"; // we can throw the exception as well
        }
        if(pos == 1) {
            return deleteAtFirst();
        } else if(pos == len) {
           return deleteAtLast();
        } else {
            pos = pos - 2;
            Node temp = head;
            while(pos > 0) {
                temp = temp.next;
                pos--;
            }
            String deletedValue = temp.next.data;
            temp.next = temp.next.next;
            return deletedValue;
        }
    }

    // Searching and updation

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        LL obj = new LL();
        // System.out.println(obj.deleteAtFirst());
        obj.insertAtFirst("Raj");
        obj.insertAtLast("Rahul");
        obj.insertAtFirst("Rohit");
        obj.insertAtLast("Mohit");
        // output ---> Rohit Raj Rahul
        obj.insertAtAnyPosition("Jannesar", 3);
        obj.display();
        System.out.println("Deleted Data " + obj.deletedAtAnyPosition(3));
        obj.display();
        // System.out.println(obj.deleteAtFirst());
        // System.out.println("The Deleted Value "+obj.deleteAtLast());
        System.out.println(obj.length());
    }
}
