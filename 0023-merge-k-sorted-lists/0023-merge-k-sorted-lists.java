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
        // The actual way TC:O(NLOGK) k-No of heads
        // Create a min-heap (priority queue) that orders ListNodes by their val (smallest at the top)
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Put the head of every non-empty list into the heap
        for (ListNode head : lists) {
            if (head != null) {          // skip if a list is empty
                pq.offer(head);          // O(log k) insert (k = number of lists)
            }
        }

        // Dummy node acts as a fixed starting point for the merged list
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;           // temp will move along the merged list as we build it

        // Keep taking the smallest node from the heap until no nodes are left
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();   // get (and remove) the node with the smallest value (O(log k))
            temp.next = node;            // append that node to the merged list
            temp = temp.next;            // advance the pointer to the newly added node

            if (node.next != null) {     // if the node had a successor in its original list
                pq.offer(node.next);     // push that successor into the heap (O(log k))
            }
        }

        // dummy.next points to the real head of the merged, fully sorted list
        return dummy.next;









        // // Brute Force TC:O(NLOGN) SC:O(N)
        // // Create a list, store all the node values, sort the list, create ll and return
        // List<Integer> temp = new ArrayList<>();
        // for(ListNode curr:lists){
        //     while(curr!=null){
        //         temp.add(curr.val);
        //         curr=curr.next;
        //     }
        // }
        // Collections.sort(temp);
        // ListNode node = new ListNode(0);
        // ListNode tail = node;
        // for(int val:temp){
        //     tail.next=new ListNode(val);
        //     tail=tail.next;
        // }
        // return node.next;
    }
}