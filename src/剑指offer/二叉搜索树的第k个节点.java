package ��ָoffer;

public class �����������ĵ�k���ڵ� {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    int cur = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot != null){
            TreeNode leftNode = KthNode(pRoot.left,k);
            if(leftNode != null){
                return leftNode;
            }
            cur++;
            if(k == cur){
                return pRoot;
            }
            TreeNode rightNode = KthNode(pRoot.right,k);
            if(rightNode != null){
                return rightNode;
            }
        }
        return null;
    }


}
