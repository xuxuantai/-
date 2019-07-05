package 剑指offer;

import java.util.ArrayList;

/**
 * Created by LaoP on 2019/7/5.
 */
public class 二叉树中和为某一值的路径 {

     public class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;

         public TreeNode(int val) {
            this.val = val;
         }
     }

    /**
     * 思想：树的深度优先遍历
     */
    /**
     * 条件：向下遍历时，当target为0，且节点左子树与右子树为空时，存入
     */
    public class Solution {
        //定义全局变量lists存储所有路径，list存储当前递归查找中的路径。
        private ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        private ArrayList<Integer> list = new ArrayList<>();

        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            //当遍历到null的节点时，返回所有路径
            if(root == null){
                return lists;
            }
            //添加当前节点值到list，并减少target
            list.add(root.val);
            target -= root.val;
            //找到一个符合条件的路径list，存入lists
            if(target == 0 && root.left == null && root.right == null){
                //注意！！！list必须new一个新的Array，不能直接传入，因为可能会改变当前递归中list的值
                lists.add(new ArrayList<>(list));
            }
            //对该节点的左右子树，递归执行
            FindPath(root.left, target);
            FindPath(root.right, target);
            //向上移动一层，移除最后一次的路径list
            list.remove(list.size() - 1);
            return lists;
        }
    }
}
