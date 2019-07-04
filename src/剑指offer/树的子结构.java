package ��ָoffer;

/**
 * Created by LaoP on 2019/7/3.
 */
public class �����ӽṹ {

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
            //������û���ӽṹ��������Ҳ�����κ������ӽṹ
            if(root1 == null || root2 == null){
                return false;
            }
            return isTree1HasTree2WhenRoot1EqualsRoot2(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        }

        //��root1��root2���ʱ��Tree1�Ƿ�ӵ��Tree2��ע�ⲻ��Tree2��Tree1���ӽṹ
        private boolean isTree1HasTree2WhenRoot1EqualsRoot2(TreeNode root1, TreeNode root2){
            //��root1Ϊ�գ�root2��Ϊ��ʱ���ش���
            if(root1 == null && root2 != null){
                return false;
            }
            //��root2Ϊ�գ�Tree1ӵ��Tree2
            if(root2 == null){
                return true;
            }
            //���ڵ�ֵ��ͬ
            if(root1.val != root2.val){
                return false;
            }
            //�ݹ��ж�root1�����������Ƿ�ӵ��root2����������
            return isTree1HasTree2WhenRoot1EqualsRoot2(root1.left, root2.left) && isTree1HasTree2WhenRoot1EqualsRoot2(root1.right, root2.right);
        }

    }
}
