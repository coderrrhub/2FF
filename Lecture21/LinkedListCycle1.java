package Lecture20;

import java.util.HashSet;

public class LinkedListCycle1 {
    public static void main(String[] args) {
        
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next != null) {
            fast = fast.next.next; // twice of slow
            slow = slow.next;
            if(slow == fast) return true;
        }

        return false;
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            if(set.contains(temp)) {
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }

        return false;
    }
}
