package Lecture20;

import java.util.HashSet;

public class LinkedListCycle2 {
    public static void main(String[] args) {
        
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                fast = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow; // fast
            }
        }

        return null;
    }

    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            if(set.contains(temp)) {
                return temp;
            }
            set.add(temp);
            temp = temp.next;
        }

        return null;
    }
}
