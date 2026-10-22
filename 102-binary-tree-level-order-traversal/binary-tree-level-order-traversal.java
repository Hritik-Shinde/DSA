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
        Queue<TreeNode> treeNodeQ = new LinkedList<>();
        List<List<Integer>> data = new ArrayList<>();
        if(root == null){
            return data;
        }
        treeNodeQ.add(root);
        while (!treeNodeQ.isEmpty()) {
            List<Integer> ans = new ArrayList<>();
            int size = treeNodeQ.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeQ.poll();
                ans.add(node.val);
                if (node.left != null) {
                    treeNodeQ.add(node.left);
                }

                if (node.right != null) {
                    treeNodeQ.add(node.right);
                }
            }
            data.add(ans);
        }
        return data;
    }
}