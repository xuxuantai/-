package ��ָoffer;

/**
 * Created by LaoP on 2019/4/12.
 */
public class �ؽ������� {
    /**
     * ���ݶ�������ǰ���������������Ľ�����ؽ����ö�����
     */
    /**
     * ����˼·
     * �ݹ�
     * ǰ������ĵ�һ��ֵΪ���ڵ��ֵ��ʹ�����ֵ�������������ֳ������֣��󲿷�Ϊ�����������������������Ҳ���Ϊ������������������Ľ����
     */

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        // ���������������ÿ��ֵ��Ӧ������
        Map<Integer, Integer> indexForInOrders = new HashMap<>();
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
        //�ֱ������Ҳ��ֵ�����������
        root.left = reConstructBinaryTreeByInorders(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTreeByInorders(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }




}
