package 剑指offer;

/**
 * Created by LaoP on 2019/7/3.
 */
public class 树的子结构 {

     public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
     }

    public class Solution {
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            //空子树没有子结构，空子树也不是任何树的子结构
            if(root1 == null || root2 == null){
                return false;
            }
            return isTree1HasTree2WhenRoot1EqualsRoot2(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        }

        //当root1和root2相等时，Tree1是否拥有Tree2：注意不是Tree2是Tree1的子结构
        private boolean isTree1HasTree2WhenRoot1EqualsRoot2(TreeNode root1, TreeNode root2){
            //当root1为空，root2不为空时返回错误
            if(root1 == null && root2 != null){
                return false;
            }
            //当root2为空，Tree1拥有Tree2
            if(root2 == null){
                return true;
            }
            //根节点值不同
            if(root1.val != root2.val){
                return false;
            }
            //递归判断root1的左右子树是否拥有root2的左右子树
            return isTree1HasTree2WhenRoot1EqualsRoot2(root1.left, root2.left) && isTree1HasTree2WhenRoot1EqualsRoot2(root1.right, root2.right);
        }

    }
}
