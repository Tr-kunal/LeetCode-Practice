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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;

        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = q.size();

            while(n-- > 0){
                TreeNode front = q.poll();
                temp.add(front.val);
                if(front.left!=null) q.offer(front.left);
                if(front.right!=null) q.offer(front.right);
            }

            ans.add(0,temp);
        }
        return ans;
    }
}