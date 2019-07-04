package ��ָoffer;

public class ����ĵ�����K���ڵ� {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode FindKthToTail(ListNode head,int k) {
            if(head == null){
                return null;
            }
            if(k == 0){
                return null;
            }
            ListNode p1 = head;
            ListNode p2 = head;
            for(int i = 1; i < k; i++){
                //p1�����k���Ľڵ�ֻ��Ҫ��k-1��
                if(p1.next != null){
                    p1 = p1.next;
                }else {
                    return null;
                }
            }
            while (p1.next != null){
                //��p1����һ���ڵ�Ϊnull��p1��������β����p2���ﵹ����k���ڵ�
                p1 = p1.next;
                p2 = p2.next;
            }
            return p2;

        }
    }

}
