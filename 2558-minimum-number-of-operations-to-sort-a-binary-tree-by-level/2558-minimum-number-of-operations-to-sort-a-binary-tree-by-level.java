/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
      int cnt=0;
      if(root==null){
        return 0;
      }
      Queue<TreeNode> queue=new LinkedList<>();
      queue.offer(root);
      while(!queue.isEmpty()){
        int size=queue.size();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode curr=queue.poll();
            list.add(curr.val);
            if(curr.left!=null){
                queue.offer(curr.left);
            }
            if(curr.right!=null){
                queue.offer(curr.right);
            }
        }
        cnt+=minSwap(list);
      }
      return cnt;
    }


    private int minSwap(List<Integer> arr) {
    int n = arr.size();
    List<int[]> indexedArr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        indexedArr.add(new int[] {arr.get(i), i});
    }
    Collections.sort(indexedArr, (a, b) -> a[0] - b[0]);

    boolean[] visited = new boolean[n];
    int swaps = 0;

    for (int i = 0; i < n; i++) {
        if (visited[i] || indexedArr.get(i)[1] == i) {
            continue;
        }
        int cycleSize = 0;
        int j = i;
        while (!visited[j]) {
            visited[j] = true;
            j = indexedArr.get(j)[1];
            cycleSize++;
        }
        if (cycleSize > 1) {
            swaps += (cycleSize - 1);
        }
    }

    return swaps;
}
}

