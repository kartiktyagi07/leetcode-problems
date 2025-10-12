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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return fill(preorder,map,0,0,n-1);
    }
    public TreeNode fill(int[] preorder,HashMap<Integer,Integer> map,int rootIndex,int start,int end){
        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = map.get(preorder[rootIndex]);
        if(mid>start){
            root.left = fill(preorder,map,rootIndex+1,start,mid-1);
        }
        if(mid<end){
            root.right = fill(preorder,map,rootIndex+mid-start+1,mid+1,end);
        }
        return root;
    }
}