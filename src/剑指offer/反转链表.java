package ��ָoffer;

public class ��ת���� {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode ReverseList(ListNode head) {
            ListNode pre = null;
            ListNode next = null;
            while (head != null){
                next = head.next;//���浱ǰ�ڵ����һ���ڵ㣬�Ա�Ͽ������ҵ�
                head.next = pre;//��ǰ�ڵ�ָ��pre��pre��ʼΪNull
                //��pre��head�ƽ�������ǰ�ڵ�head��Ϊpre����ǰ�ڵ��next��Ϊhead
                pre = head;
                head = next;
            }
            //��Ϊ�˳�ѭ��ʱ��head�Ѿ���null�ˣ����Է���pre
            return pre;

        }
    }
}
