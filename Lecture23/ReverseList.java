package Lecture21;

public class ReverseList {
    public static void main(String[] args) {
        
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            // data store i.e. address
            ListNode nextNode = curr.next;
            curr.next = prev; // data modify
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
