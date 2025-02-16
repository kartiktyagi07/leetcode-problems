class MyLinkedList {
    Node head;
    Node tail;
    int size;
    public static class Node{
        int data;
        Node next;
    }

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    public int getFirst(){
        if(size==0){
            return -1;
        }else{
            return head.data;
        }
    }
    public int getLast(){
        if(size==0){
            return -1;
        }else{
            return tail.data;
        }
    }
    public int get(int index) {
        if(index<0 || index > size-1){
            return -1;
        }else if(index==0){
            return getFirst();
        }else if(index==size-1){
            return getLast();
        }else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    
    public void addAtHead(int val) {
        Node temp=new Node();
        temp.data=val;
        temp.next=head;
        head=temp;
        if(size==0){
            tail=temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp=new Node();
        temp.data=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return; 
        }
        if(index==0){
            addAtHead(val);
        }else if(index==size){
            addAtTail(val);
        }else{
            Node node=new Node();
            node.data=val;
            Node temp=head;
            for(int i=0;i<index-1;i++){
                if(temp==null){
                    return;
                }
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }else if(index==0){
            removeFirst();
        }else if(index==size-1){
            removeLast();
        }else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public void removeFirst(){
        if(size==1){
            head=tail=null;
            size=0;
        }else{
            head=head.next;
            size--;
        }
    }
    public void removeLast(){
        if(size==1){
            head=tail=null;
            size=0;
        }else{
            Node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */