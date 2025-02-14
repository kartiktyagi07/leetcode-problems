class ProductOfNumbers {
    ArrayList<Integer> list=new ArrayList<>();
    public ProductOfNumbers() {
        list.clear();
    }
    
    public void add(int num) {
        if(num==0){
            list.clear();
        }else{
            list.add(num);
        }
        
    }
    
    public int getProduct(int k) {
        if (k > list.size()) {
            return 0;
        }
        int prod=1;
        for(int i=list.size()-k;i<list.size();i++){
            prod=prod*list.get(i);
            if(prod==0){
                return 0;
            }
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */