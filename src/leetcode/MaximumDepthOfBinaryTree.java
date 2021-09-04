package leetcode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int height = 1;
        return depthFinder(root, height);
    }

    public int depthFinder(TreeNode root, int height){
        if(root==null){
            return height-1;
        }

        int left = depthFinder(root.left,height+1);

        int right = depthFinder(root.right,height+1);

        return Math.max(left,right);
    }
}
