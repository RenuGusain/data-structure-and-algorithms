package renu.gusain.dsa.tree;

public class LeetCode124 {
    public static int max;

    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        backtrack(root);
        return max;
    }

    public int backtrack(TreeNode root) {
        if (root == null) return 0;

        // Ignore negative contributions
        int leftMax = Math.max(0, backtrack(root.left));
        int rightMax = Math.max(0, backtrack(root.right));

        // Calculate max path sum passing through this node
        int currentPathSum = root.val + leftMax + rightMax;

        // Update global max
        max = Math.max(max, currentPathSum);

        // Return max sum path extending *upward* from this node
        return root.val + Math.max(leftMax, rightMax);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
