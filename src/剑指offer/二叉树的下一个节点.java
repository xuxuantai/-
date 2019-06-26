package 剑指offer;
/**
 * Created by LaoP on 2019/4/12.
 */
public class 二叉树的下一个节点 {
    /**
     * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     */
    /**
     *解体思路
     * 如果节点的右子树不为空，则下一个节点为右子树的最左节点
     * 如果节点的右子树为空，则一直向左上找，下一个节点是最左上节点的父亲节点
     */
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }

        public TreeLinkNode GetNext(TreeLinkNode pNode) {
            if (pNode.right != null) {
                TreeLinkNode node = pNode.right;
                while (node.left != null)
                    node = node.left;
                return node;
            } else {
                while (pNode.next != null) {
                    TreeLinkNode parent = pNode.next;
                    if (parent.left == pNode)
                        return parent;
                    pNode = pNode.next;
                }
            }
            return null;
        }
    }



}
