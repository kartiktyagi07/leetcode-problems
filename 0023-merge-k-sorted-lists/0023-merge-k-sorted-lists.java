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
    public ListNode mergeKLists(ListNode[] lists) {
        // Brute Force TC:O(NLOGN) SC:O(N)
        // Create a list, store all the node values, sort the list, create ll and return
        List<Integer> temp = new ArrayList<>();
        for(ListNode curr:lists){
            while(curr!=null){
                temp.add(curr.val);
                curr=curr.next;
            }
        }
        Collections.sort(temp);
        ListNode node = new ListNode(0);
        ListNode tail = node;
        for(int val:temp){
            tail.next=new ListNode(val);
            tail=tail.next;
        }
        return node.next;
    }
}