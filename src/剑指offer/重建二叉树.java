package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LaoP on 2019/4/12.
 */
public class 重建二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;

        }
    }
    /**
     * 根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树
     */
    /**
     * 解题思路
     * 递归
     * 前序遍历的第一个值为根节点的值，使用这个值将中序遍历结果分成两部分，左部分为树的左子树中序遍历结果，右部分为树的右子树中序遍历的结果。
     */
    Map<Integer, Integer> indexForInOrders = new HashMap<>();
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        // 缓存中序遍历数组每个值对应的索引

        for (int i = 0; i < in.length; i++)
            indexForInOrders.put(in[i], i);
        return reConstructBinaryTreeByInorders(pre, 0, pre.length - 1, 0);
    }

    private TreeNode reConstructBinaryTreeByInorders(int[] pre, int preL, int preR, int inL) {
        if (preL > preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex - inL;
        //分别求左右部分的中序遍历结果
        root.left = reConstructBinaryTreeByInorders(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTreeByInorders(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }




}
