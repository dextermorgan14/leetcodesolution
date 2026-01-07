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
    private long totalsum=0;
    private long maxp=0;
    private static final int modd=1_000_000_007;

    private long gettotalsum(TreeNode root)
    {
        if(root==null)return 0;

        return root.val+gettotalsum(root.left)+gettotalsum(root.right);
    }

    private long dfs(TreeNode root)
    {
        if(root==null)return 0;
        long leftsum=dfs(root.left);
        long rightsum=dfs(root.right);
        long subtreesum=root.val+leftsum+rightsum;
        long product =subtreesum*(totalsum-subtreesum);

        maxp=Math.max(maxp,product);

        return subtreesum;
    }
    public int maxProduct(TreeNode root) {
        totalsum=gettotalsum(root);
        dfs(root);
        return (int)(maxp%modd);


    }
}