package Easy;

// https://leetcode.com/problems/reverse-linked-list/
public class Reverse_Linked_List_206 {
    public static ListNode reverseList(ListNode head) {
        ListNode r = null;
        while (head != null) {
            ListNode t = head.next;
            head.next = r;
            r = head;
            head = t;
        }
        return r;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
