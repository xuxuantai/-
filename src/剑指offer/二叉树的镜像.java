package ½£Ö¸offer;

public class ¶þ²æÊ÷µÄ¾µÏñ {

     public class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;

         public TreeNode(int val) {
            this.val = val;
         }
     }

    public class Solution {
        public void Mirror(TreeNode root) {
            if(root == null){
                return;
            }
            if(root == null && root == null){
                return;
            }

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            if(root.right != null){
                Mirror(root.right);
            }
            if(root.left != null){
                Mirror(root.left);
            }

        }
    }
}
