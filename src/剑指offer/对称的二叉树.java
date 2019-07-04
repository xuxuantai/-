package 剑指offer;

public class 对称的二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public class Solution {

        boolean isSymmetrical(TreeNode pRoot) {
            if(pRoot == null){
                return true;
            }
            //当左右子树为镜像时，树对称
            return isMirror(pRoot.left, pRoot.right);
        }

        private boolean isMirror(TreeNode left, TreeNode right){

            if(left == null && right == null){
                return true;
            }
            if((left == null && right != null) || (right == null && left != null)){
                return false;
            }
            if(left.val != right.val){
                return false;
            }
            //当左子树的左子树与右子树的右子树互为镜像，左子树的右子树与右子树的左子树互为镜像，左右子树互为镜像
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }
}
