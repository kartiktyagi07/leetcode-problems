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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int l=0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<TreeNode> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(l%2!=0){
                    list.add(node);
                }
            }
            if(l%2!=0){
                int left=0;
                int right=list.size()-1;
                while(left<right){
                    int temp=list.get(left).val;
                    list.get(left).val=list.get(right).val;
                    list.get(right).val=temp;
                    left++;
                    right--;
                }

            }
            l++;
        }
        return root;
    }
}