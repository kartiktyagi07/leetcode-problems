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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int c=0;
        ListNode temp1=l1,temp2=l2;
        while(temp1!=null || temp2!=null){
            int val1=temp1!=null?temp1.val:0;
            int val2=temp2!=null?temp2.val:0;
            int sum= (val1 + val2 + c);
            int digit=sum%10;
            c=sum/10;
            curr.next=new ListNode(digit);
            curr=curr.next;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(c>0){
            curr.next=new ListNode(c);
        }
        return dummy.next;
    }
}