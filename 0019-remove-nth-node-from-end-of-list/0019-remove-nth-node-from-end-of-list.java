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

        // Two pass approach : 1.first fine size  2.delete (size-n)th node from start
        // TC:O(n) SC:O(1)

        // int size=0;
        // ListNode curr=head;
        // while(curr!=null){
        //     size++;
        //     curr=curr.next;
        // }
        // if(size==n) return head.next;
        // curr=head;
        // int condition=size-n;
        // for(int i=1;i<condition;i++){
        //     curr=curr.next;
        // }
        // curr.next=curr.next.next;
        // return head;



        // Single pass approach using two pointers

        // here we initialize a dummy node and points dummy next to head then
        // we initilaise two pointers slow and fast.first we move slow n times so 
        // that the diff. b/w slow and fast is exactly n then we move both slow and
        // fast linearly when slow points null then fast is at correct position then
        // delete the node.

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<=n;i++){
            slow=slow.next;
        }
        while(slow!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=fast.next.next;
        return dummy.next;
    }
}