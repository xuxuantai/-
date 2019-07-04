package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上往下打印二叉树 {

     public class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;
         public TreeNode(int val) {
            this.val = val;

         }
     }

     public class Solution {
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<Integer> result = new ArrayList<>();

            queue.add(root);

            while(!queue.isEmpty()){
                int cnt = queue.size();
                for(int i = 0; i < cnt; i++){
                    TreeNode t = queue.poll();
                    if(t == null){
                        continue;
                    }
                    result.add(t.val);
                    queue.add(t.left);
                    queue.add(t.right);
                }
            }
            return result;
        }
     }
}
