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
        // TC:O(N) SC:O(N)
        
        // The intuition is copy the elements of linkedlist in an array, perform
        // swapping and again assign the values of arr to linkedlist nodes

        // Calculating size of array 
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        // Building the array
        int[] arr=new int[size];
        int idx=0;
        curr=head;
        while(curr!=null){
            arr[idx++]=curr.val;
            curr=curr.next;
        }
        // Swap the required
        int temp=arr[k-1];
        arr[k-1]=arr[size-k];
        arr[size-k]=temp;
        // Constructing the new LinkedList
        curr=head;
        idx=0;
        while(curr!=null){
            curr.val=arr[idx++];
            curr=curr.next;
        }
        return head;
    }
}