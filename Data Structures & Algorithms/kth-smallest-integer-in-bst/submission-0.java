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
    int count=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        int arr[]={0};
        kthEle(root,k,arr);
        return ans;
    }

    void kthEle(TreeNode root,int k,int arr[]){
         
         if(root==null) return;

         kthEle(root.left,k,arr);
         arr[0]=arr[0]+1;
         if(arr[0]==k) ans=root.val; 
         kthEle(root.right,k,arr);
    }

}
