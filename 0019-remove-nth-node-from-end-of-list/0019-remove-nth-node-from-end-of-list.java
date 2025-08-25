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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two pass approach : 1.first fine size  2.delete (size-n)th node from start
        // TC:O(n) SC:O(1)
        
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        if(size==n) return head.next;
        curr=head;
        int condition=size-n;
        for(int i=1;i<condition;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}