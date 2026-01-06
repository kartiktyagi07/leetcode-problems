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
    public int maxLevelSum(TreeNode root) {
        // It's a clear cut BFS question. Just do as the question says.
        Queue<TreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int ans = 1;
        int level = 1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int currSum = 0;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                currSum += node.val;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            if(currSum > maxSum){
                maxSum = currSum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}