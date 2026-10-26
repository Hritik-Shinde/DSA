/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.equals(p) || root.equals(q)){
            return root;
        }
        TreeNode lval = lowestCommonAncestor(root.left,p,q);
        TreeNode rval = lowestCommonAncestor(root.right,p,q);
        if(lval == null){
            return rval;
        }else if(rval == null){
            return lval;
        }

        return root;
    }
}