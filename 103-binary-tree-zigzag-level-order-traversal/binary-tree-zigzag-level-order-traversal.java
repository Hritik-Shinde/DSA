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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> data = new ArrayList<>();
        if(root == null){
            return data;
        }
        Queue<TreeNode> treeNodeQ = new LinkedList<>();
        treeNodeQ.add(root);
        Boolean toChange = false;
        while(!treeNodeQ.isEmpty()){
            int size = treeNodeQ.size();
            List<Integer> ans = new ArrayList<>();
            Stack<Integer> revStack = new Stack<>();
            for(int i =0;i<size;i++){
                TreeNode node = treeNodeQ.poll();
                if(toChange){
                    revStack.push(node.val);
                }
                else{
                    ans.add(node.val);
                }   
                if(node.left != null)
                    treeNodeQ.add(node.left);
                if(node.right != null)
                    treeNodeQ.add(node.right);
            }
            toChange = !toChange;

            while(!revStack.isEmpty()){
                ans.add(revStack.pop());
            } 
            data.add(ans);
        }

        return data;
    }
}