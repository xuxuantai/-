package ��ָoffer;

public class ����������� {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * �������������������������� + 1����Ϊ������ȡ�
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
