package ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(
                3, new ListNode(4, new ListNode(5, null)))));
        for (ListNode node = head; node != null; node = node.next) {
            System.out.print(node.val);
        }
        System.out.println();
        for (ListNode node = reverseList(head); node != null; node = node.next) {
            System.out.print(node.val);
        }
//        for (ListNode node = recursiveReverseList(head); node != null; node = node.next) {
//            System.out.print(node.val);
//        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Recursive version
    public static ListNode recursiveReverseList(ListNode head) {
        return rev(head, null);
    }

    public static ListNode rev(ListNode node, ListNode prev) {
        if (node == null) return prev;
        ListNode temp = node.next;
        node.next = prev;
        return rev(temp, node);
    }
}
