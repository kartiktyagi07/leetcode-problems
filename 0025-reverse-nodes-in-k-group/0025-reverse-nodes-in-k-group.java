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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Brute Force TC:O(N) SC:O(N)
        List<Integer> temp = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            temp.add(curr.val);
            curr = curr.next;
        }
        int i=0;
        int j=k;
        while(j<=temp.size()){
            reverse(temp,i,j-1);
            i=j;
            j+=k;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(int val:temp){
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        return dummy.next;
    }
    public void reverse(List<Integer> list,int start,int end){
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}