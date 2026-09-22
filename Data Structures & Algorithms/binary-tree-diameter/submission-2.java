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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
           if(root==null) return 0;

           int left= findLen(root.left);
           int right = findLen(root.right); 

           int diameter = left+right;
 
           int sub = Math.max(diameterOfBinaryTree(root.right),diameterOfBinaryTree(root.left));

           return Math.max(diameter,sub);

    }

    int findLen(TreeNode root){
        if(root==null) return 0;

        int left = findLen(root.left);
        int right = findLen(root.right);

        return Math.max(left,right)+1;
    }
}
