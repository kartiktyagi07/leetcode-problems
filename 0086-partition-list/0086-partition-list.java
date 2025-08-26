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
    public ListNode partition(ListNode head, int x) {
        // Doing it inbuilt without extra space TC:O(N) SC:O(1)
        ListNode beforeHead=new ListNode(0);
        ListNode afterHead=new ListNode(0);
        ListNode before=beforeHead;
        ListNode after=afterHead;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                before.next=curr;
                before=before.next;
            }else{
                after.next=curr;
                after=after.next;
            }
            curr=curr.next;
        }
        after.next=null;
        before.next=afterHead.next;
        return beforeHead.next;
        
        
        
        
        
        
        
        
        
        
        
        
        
        // // Using extra space TC:O(N) SC:O(N)

        // ArrayList<ListNode> small=new ArrayList<>();
        // ArrayList<ListNode> bigOrEqual=new ArrayList<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     if(curr.val<x){
        //         small.add(curr);
        //     }else{
        //         bigOrEqual.add(curr);
        //     }
        //     curr=curr.next;
        // }
        // ListNode temp=new ListNode(0);
        // ListNode dummy=temp;
        // for(ListNode a:small){
        //     dummy.next=a;
        //     dummy=dummy.next;
        // }
        // for(ListNode a:bigOrEqual){
        //     dummy.next=a;
        //     dummy=dummy.next;
        // }
        // dummy.next=null;
        // return temp.next;

    }
}