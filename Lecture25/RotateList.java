package Lecture25;

public class RotateList {
    public static void main(String[] args) {
        
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }

        int len = findLength(head);
        k = k % len;
        if(k == 0) return head;

        int steps = len - k - 1;
        ListNode temp = head;
        while(steps > 0) {
            temp = temp.next;
            steps--;
        }

        ListNode newHead = temp.next;
        temp.next = null;
        temp = newHead;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        return newHead;
    }

    public int findLength(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }
}
