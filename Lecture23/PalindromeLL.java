package Lecture21;

public class PalindromeLL {
    public static void main(String[] args) {
        isPalindrome(head);
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode reverseHead = reverseList(mid);

        while(reverseHead != null) {
            if(reverseHead.val != head.val) {
                return false;
            }
            System.out.println(head.val+" "+reverseHead.val);
            reverseHead = reverseHead.next;
            head = head.next;
        }

        return true;
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

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // when fast reaches at the end ----> slow (middle)
    }
}
