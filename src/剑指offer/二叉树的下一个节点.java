package ��ָoffer;
/**
 * Created by LaoP on 2019/4/12.
 */
public class ����������һ���ڵ� {
    /**
     * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
     */
    /**
     *����˼·
     * ����ڵ����������Ϊ�գ�����һ���ڵ�Ϊ������������ڵ�
     * ����ڵ��������Ϊ�գ���һֱ�������ң���һ���ڵ��������Ͻڵ�ĸ��׽ڵ�
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
