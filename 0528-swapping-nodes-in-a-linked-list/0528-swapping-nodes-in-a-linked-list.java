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
    public ListNode swapNodes(ListNode head, int k) {
        // Second Approach TC:O(N) SC:O(1)
        // Find kth node from starting and ending then swap their values

        // finding the kth node from start
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode startingNode=first;
        // Finding the kth node from end
        ListNode second=head;
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        ListNode endingNode=second;
        // Swap their values
        int temp=startingNode.val;
        startingNode.val=endingNode.val;
        endingNode.val=temp;
        // Returning head
        return head;










        // // TC:O(N) SC:O(N)

        // // The intuition is copy the elements of linkedlist in an array, perform
        // // swapping and again assign the values of arr to linkedlist nodes

        // // Calculating size of array 
        // int size=0;
        // ListNode curr=head;
        // while(curr!=null){
        //     size++;
        //     curr=curr.next;
        // }
        // // Building the array
        // int[] arr=new int[size];
        // int idx=0;
        // curr=head;
        // while(curr!=null){
        //     arr[idx++]=curr.val;
        //     curr=curr.next;
        // }
        // // Swap the required
        // int temp=arr[k-1];
        // arr[k-1]=arr[size-k];
        // arr[size-k]=temp;
        // // Constructing the new LinkedList
        // curr=head;
        // idx=0;
        // while(curr!=null){
        //     curr.val=arr[idx++];
        //     curr=curr.next;
        // }
        // return head;
    }
}