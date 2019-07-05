package 剑指offer;

import java.util.*;

/**
 * Created by LaoP on 2019/7/5.
 */
public class 按之字形顺序打印二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> results = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(pRoot);
            //添加一位反转标志位
            boolean reverse = false;
            while(!queue.isEmpty()){
                ArrayList<Integer> result =  new ArrayList<>();
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
                //如果反转标志位为true，则反转该行的结果
                if(reverse){
                    Collections.reverse(result);
                }
                reverse = !reverse;
                if(result.size() != 0){
                    results.add(result);
                }
            }
            return results;
        }

    }
}
