package 剑指offer;

public class 平衡二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * 平衡二叉树的左右子树深度差最大为1，先计算左右子树的深度
     */

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }else{
            if(Math.abs(Depth(root.right) - Depth(root.left)) > 1){
                return false;
            }else{
                return true;
            }
        }
    }

    private int Depth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1 + Math.max(Depth(root.left),Depth(root.right));
        }
    }


}
