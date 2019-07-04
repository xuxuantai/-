package ��ָoffer;

public class �ԳƵĶ����� {

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
            //����������Ϊ����ʱ�����Գ�
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
            //����������������������������������Ϊ������������������������������������Ϊ��������������Ϊ����
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }
}
