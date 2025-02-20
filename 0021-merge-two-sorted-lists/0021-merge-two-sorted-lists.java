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
    ListNode head;
    ListNode tail;
    int size;

    public Solution() {
        head = null;
        tail = null;
        size = 0;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1!=null && list2!=null){
            int val1=list1.val;
            int val2=list2.val;
            if(val1>=val2){
                addAtTail(val2);
                list2=list2.next;
            }else{
                addAtTail(val1);
                list1=list1.next;
            }
        }
        while(list1!=null){
            addAtTail(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            addAtTail(list2.val);
            list2=list2.next;
        }
        return head;
    }
    public void addAtTail(int val) {
        ListNode temp=new ListNode();
        temp.val=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
}