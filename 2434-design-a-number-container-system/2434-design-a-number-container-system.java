class NumberContainers {
    HashMap<Integer, Integer> indextonumber;
    HashMap<Integer, TreeSet<Integer>> numbertoindex;

    public NumberContainers() {
        indextonumber = new HashMap<>();
        numbertoindex = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indextonumber.containsKey(index)) {
            int prev=indextonumber.get(index);
            numbertoindex.get(prev).remove(index);
            if(numbertoindex.get(prev).size()==0){
                numbertoindex.remove(prev);
            }
        }
        indextonumber.put(index,number);
        if(!numbertoindex.containsKey(number)){
            numbertoindex.put(number,new TreeSet<>());
        }
        numbertoindex.get(number).add(index);
    }

    public int find(int number) {
        if(!numbertoindex.containsKey(number)){
            return -1;
        }
        return numbertoindex.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */