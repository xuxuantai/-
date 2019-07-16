package 剑指offer;

public class 二叉树的深度 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * 返回左子树和右子树更深的深度 + 1，即为树的深度。
     * @param root
     * @return
     */

    public int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1 + Math.max(TreeDepth(root.right),TreeDepth(root.left));
        }
    }

}
