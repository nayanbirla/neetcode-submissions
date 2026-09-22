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
    public TreeNode invertTree(TreeNode root) {
        
        
          invert(root);
          return root;

    }

    void invert(TreeNode root){
         if(root==null) return;
       

        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        if(left!=null && right!=null){  
        TreeNode temp = left;
        root.left=right;
        root.right=temp;
        }else if(left==null && right!= null){
            root.left=right;
            root.right=null;
        }else if(left!=null && right==null){
            root.right=left;
            root.left=null;
        }
    }
}
