package Lecture19;

public class MiddleNode {
    public static void main(String[] args) {
        
    }

    public ListNode solution1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // when fast reaches at the end ----> slow (middle)
    }

    public ListNode solution2(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        int steps = count / 2;
        temp = head;
        while(steps > 0) {
            temp = temp.next;
            steps--;
        }

        return temp;
    }
}
