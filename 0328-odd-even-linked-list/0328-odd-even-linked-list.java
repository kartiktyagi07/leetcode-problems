/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddHead = head;
        ListNode oddTail = oddHead;
        ListNode evenHead = head.next;
        ListNode evenTail = evenHead;
        ListNode temp = evenTail.next;
        boolean isOdd = true;
        while (temp != null) {
            if (isOdd) {
                oddTail.next = temp;
                oddTail = temp;
            } else {
                evenTail.next = temp;
                evenTail = temp;
            }
            temp = temp.next;
            isOdd = !isOdd;
        }
        evenTail.next = null;
        oddTail.next = evenHead;
        return oddHead;
    }
}