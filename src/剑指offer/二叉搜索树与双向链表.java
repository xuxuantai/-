package 剑指offer;

public class 二叉搜索树与双向链表 {

     public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
     }
    public class Solution {
        /**
         * 1.将左子树转换为双链表，递归执行
         * 2.如果左子树的转换结果不为空，移动到左链接的最后一个节点
         * 3.将当前节点拼接到左链接之后
         * 4.对右子树进行转换，递归执行
         * 5.如果右子树的转换结果不为空，则将右子树的结果拼接在左子树和当前节点之后
         *
         */
        public TreeNode Convert(TreeNode pRootOfTree) {

            if(pRootOfTree == null){
                return null;
            }
            if(pRootOfTree.left == null && pRootOfTree.right == null){
                return pRootOfTree;
            }
            //将左子树转化为双向链表
            TreeNode left = Convert(pRootOfTree.left);
            TreeNode p = left;
            if(p != null){
                //找到left的最后一个节点p
                while (p.right != null){
                    p = p.right;
                }
                //将root节点拼接在left之后
                p.right = pRootOfTree;
                pRootOfTree.left = p;
            }
            //将右子树转换为双向链表
            TreeNode right = Convert(pRootOfTree.right);
            //当right不为空时，将right拼接与root之后
            if(right != null){
                pRootOfTree.right = right;
                right.left = pRootOfTree;
            }

            //当左节点不为空时才返回左节点，否则返回root节点
            if(left == null){
                return pRootOfTree;
            }else {
                return left;
            }
        }
    }
}
