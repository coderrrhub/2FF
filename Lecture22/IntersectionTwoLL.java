package Lecture20;

import java.util.HashSet;

public class IntersectionTwoLL {
    public static void main(String[] args) {
        
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != tempB) {
            if(tempA == null) {
                tempA = headB;
            } else {
                tempA = tempA.next;
            }
            
            if(tempB == null) {
                tempB = headA;
            } else {
                tempB = tempB.next;
            }
        }

        return tempA; // tempB
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while(temp != null) {
            if(set.contains(temp)) {
                return temp;
            }

            temp = temp.next;
        }

        return null; // no intersection point
    }
}
