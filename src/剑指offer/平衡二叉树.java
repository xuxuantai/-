package ��ָoffer;

public class ƽ������� {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * ƽ�������������������Ȳ����Ϊ1���ȼ����������������
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
