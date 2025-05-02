class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        int i=0;
        String[] arr1=sentence1.trim().split("\\s+");
        String[] arr2=sentence2.trim().split("\\s+");
        if(arr1.length>arr2.length){
            String[] temp=arr1;
            arr1=arr2;
            arr2=temp;
        }
        int n1=arr1.length;
        int n2=arr2.length;
        while(i<n1 && arr1[i].equals(arr2[i])){
            i++;
        }
        int j=0;
        while(j<n1-i && arr1[n1-1-j].equals(arr2[n2-1-j])){
            j++;
        }
        return i+j==n1;
        
    }
}