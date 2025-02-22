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
        ListNode temp1=head;
        ListNode temp2=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp1!=null){
            list.add(temp1.val);
            temp1=temp1.next;
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            temp2.val=list.get(i);
            temp2=temp2.next;
        }
        return head;
    }
}