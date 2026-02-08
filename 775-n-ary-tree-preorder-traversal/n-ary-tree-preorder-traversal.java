class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        DFS(root, ans);
        return ans;
    }

    private void DFS(Node root, List<Integer> ans) {
        if (root == null) return;

        ans.add(root.val);

        for (Node child : root.children){
            DFS(child, ans);
        }
    }
}
