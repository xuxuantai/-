package ��ָoffer;

import java.util.LinkedList;

/**
 * Created by LaoP on 2019/7/12.
 */
public class ��������ĵ�һ�������ڵ� {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * l1����Ϊa+b,l2����Ϊc+b,������a+b+c=c+b+a
     * l1���������l2
     * l2���������l1
     * ��ͷ��ʱ��Ϊ����
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //���ȱ���ͷ�ڵ㣬��Ϊѭ�����̻�ı�ڵ�
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2){
            l1 = (l1 == null) ? pHead2 : l1.next;
            l2 = (l2 == null) ? pHead1 : l2.next;
        }
        return l1;
    }
}
