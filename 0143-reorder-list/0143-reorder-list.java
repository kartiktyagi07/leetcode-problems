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
    public void reorderList(ListNode head) {
        // Using Stack TC:O(N) SC:O(N)
        //Traverse the entire linked list and push each node onto a stack.
        // Iterate through the list again from the head. For each node, pop a node    from the stack. The popped node will be the last node from the original list.
        // Insert the popped node between the current node and its next node.
        // To ensure the loop terminates correctly and avoids cycles, stop when the number of nodes processed is half the total number of nodes in the list.

        if(head==null || head.next==null){
            return;
        }
        ListNode curr=head;
        Stack<ListNode> st=new Stack<>();
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        curr=head;
        int n=st.size();
        for(int i=0;i<n/2;i++){
            ListNode lastNode=st.pop();
            ListNode nextNode=curr.next;
            curr.next=lastNode;
            lastNode.next=nextNode;
            curr=nextNode;
        }
        curr.next=null;
    }
}