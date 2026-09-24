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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null) return ans;
        que.add(root);

        while(!que.isEmpty()){
            
            int size = que.size();
            List<Integer> curr=new ArrayList<>();
            while(size>0){
                 TreeNode curr1 = que.poll();
                 curr.add(curr1.val); 
                 if(curr1.left!=null){
                    que.add(curr1.left);
                 }
                 if(curr1.right!=null){
                    que.add(curr1.right);
                 }
                 size--;
            }
            ans.add(curr);
        }
        return ans;
    }
}
