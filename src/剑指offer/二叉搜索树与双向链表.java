package ��ָoffer;

public class ������������˫������ {

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
         * 1.��������ת��Ϊ˫�����ݹ�ִ��
         * 2.�����������ת�������Ϊ�գ��ƶ��������ӵ����һ���ڵ�
         * 3.����ǰ�ڵ�ƴ�ӵ�������֮��
         * 4.������������ת�����ݹ�ִ��
         * 5.�����������ת�������Ϊ�գ����������Ľ��ƴ�����������͵�ǰ�ڵ�֮��
         *
         */
        public TreeNode Convert(TreeNode pRootOfTree) {

            if(pRootOfTree == null){
                return null;
            }
            if(pRootOfTree.left == null && pRootOfTree.right == null){
                return pRootOfTree;
            }
            //��������ת��Ϊ˫������
            TreeNode left = Convert(pRootOfTree.left);
            TreeNode p = left;
            if(p != null){
                //�ҵ�left�����һ���ڵ�p
                while (p.right != null){
                    p = p.right;
                }
                //��root�ڵ�ƴ����left֮��
                p.right = pRootOfTree;
                pRootOfTree.left = p;
            }
            //��������ת��Ϊ˫������
            TreeNode right = Convert(pRootOfTree.right);
            //��right��Ϊ��ʱ����rightƴ����root֮��
            if(right != null){
                pRootOfTree.right = right;
                right.left = pRootOfTree;
            }

            //����ڵ㲻Ϊ��ʱ�ŷ�����ڵ㣬���򷵻�root�ڵ�
            if(left == null){
                return pRootOfTree;
            }else {
                return left;
            }
        }
    }
}
