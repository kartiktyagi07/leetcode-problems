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
    public ListNode sortList(ListNode head) {
        // METHOD 1 BRITE FORCE TC:O(NLOGN) SC:O(N) 

        // ListNode temp1=head;
        // ListNode temp2=head;
        // ArrayList<Integer> list=new ArrayList<>();
        // while(temp1!=null){
        //     list.add(temp1.val);
        //     temp1=temp1.next;
        // }
        // Collections.sort(list);
        // for(int i=0;i<list.size();i++){
        //     temp2.val=list.get(i);
        //     temp2=temp2.next;
        // }
        // return head;

        // METHOD 2 OPTIMIZED CODE TC:O(NLOGN) SC:O(1) 
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode findMid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode merge(ListNode t1,ListNode t2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }else{
            temp.next=t2;
        }
        return dummy.next;
    }
}