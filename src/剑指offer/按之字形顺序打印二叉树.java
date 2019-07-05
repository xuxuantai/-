package ��ָoffer;

import java.util.*;

/**
 * Created by LaoP on 2019/7/5.
 */
public class ��֮����˳���ӡ������ {

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
            //���һλ��ת��־λ
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
                //�����ת��־λΪtrue����ת���еĽ��
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
