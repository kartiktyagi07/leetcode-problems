/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Approach 1
        /* First assign next pointer,save the corresponding created node in map and again
        Traverse the copied list and fill the random pointer */

        Map<Node,Node> map = new HashMap<>();
        Node curr = head;
        Node prev = null;
        Node newHead = null;
        // First Traversal for filling the next pointer
        while(curr!=null){
            Node temp = new Node(curr.val);
            map.put(curr,temp);
            if(newHead==null){
                newHead = temp;
                prev = newHead;
            }else{
                prev.next = temp;
                prev = temp;
            }
            curr = curr.next;
        }

        // Second Traversal for filling the random pointer
        curr = head;
        Node newCurr = newHead;
        while(curr!=null){
            if(curr.random==null){
                newCurr.random = null;
            }else{
                newCurr.random = map.get(curr.random);
            }
            curr = curr.next;
            newCurr = newCurr.next;
        }
        return newHead;


    }
}