class MinStack {
    ArrayList<Integer> list;
    ArrayList<Integer> minList;
    public MinStack() {
        list=new ArrayList<>();
        minList=new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if(minList.size()==0 || minList.get(minList.size()-1)>=val){
            minList.add(val);
        }
    }
    
    public void pop() {
        int val = list.remove(list.size() - 1);
        if(minList.get(minList.size()-1)==val){
            minList.remove(minList.size()-1);
        }
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return minList.get(minList.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */