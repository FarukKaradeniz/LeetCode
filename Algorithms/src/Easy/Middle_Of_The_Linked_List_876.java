package Easy;

//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class Middle_Of_The_Linked_List_876 {
    public static void main(String[] args) {
        ListNode listNode = middleNode(new ListNode(1));
        System.out.println(listNode.val);
    }

    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode back = head;
        int i = 0;
        while (head.next != null) {
            if (i % 2 == 0) {
                back = back.next;
            }

            head = head.next;
            i++;
        }
        return back;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
