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
    int mod = 1000000007;
    long ans = 0;
    long totalSum = 0;
    public int maxProduct(TreeNode root) {
        totalSum = totalSumDfs(root);
        subTreeDfs(root);
        return (int)(ans % mod);
    }
    // It will give the total sum of tree nodes.
    public int totalSumDfs(TreeNode node){
        if(node == null){
            return 0;
        }
        return node.val + totalSumDfs(node.left) + totalSumDfs(node.right);
    }
    // It'll build our answer.
    public long subTreeDfs(TreeNode node){
        if(node == null) return 0;
        long left = subTreeDfs(node.left);
        long right = subTreeDfs(node.right);
        long total = left + right + node.val;
        long product = (totalSum - total) * total;
        ans = Math.max(ans,product);
        return total;
    }
}