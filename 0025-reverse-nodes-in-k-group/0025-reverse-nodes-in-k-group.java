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
        // Actual Approach we are going to use recursion

        // Check if at least k nodes exist starting from head
        ListNode temp = head;
        int cnt = 0;
        while (cnt < k) {
            if (temp == null) return head; // Not enough nodes -> return head as it is
            temp = temp.next;
            cnt++;
        }

        // Recursively process the remaining list after the first k nodes
        ListNode prevNode = reverseKGroup(temp, k);

        // Reverse the current group of k nodes
        temp = head;
        cnt = 0;
        while (cnt < k) {
            ListNode nextNode = temp.next; // Store next node
            temp.next = prevNode;          // Point current node to already reversed part
            prevNode = temp;               // Move prevNode one step forward
            temp = nextNode;               // Move temp one step forward
            cnt++;
        }

        // Return new head of this reversed group
        return prevNode;

        










        // // Brute Force TC:O(N) SC:O(N)

        // List<Integer> temp = new ArrayList<>();
        // ListNode curr = head;
        // while(curr!=null){
        //     temp.add(curr.val);
        //     curr = curr.next;
        // }
        // int i=0;
        // int j=k;
        // while(j<=temp.size()){
        //     reverse(temp,i,j-1);
        //     i=j;
        //     j+=k;
        // }
        // ListNode dummy = new ListNode(0);
        // ListNode tail = dummy;
        // for(int val:temp){
        //     tail.next = new ListNode(val);
        //     tail = tail.next;
        // }
        // return dummy.next;
    }
    
    // public void reverse(List<Integer> list,int start,int end){
    //     while(start<end){
    //         int temp = list.get(start);
    //         list.set(start,list.get(end));
    //         list.set(end,temp);
    //         start++;
    //         end--;
    //     }
    // }

}