package 剑指offer;

import java.util.LinkedList;

/**
 * Created by LaoP on 2019/7/12.
 */
public class 两个链表的第一个公共节点 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * l1长度为a+b,l2长度为c+b,所以有a+b+c=c+b+a
     * l1走完接着走l2
     * l2走完接着走l1
     * 碰头的时候即为交点
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //事先保存头节点，因为循环过程会改变节点
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2){
            l1 = (l1 == null) ? pHead2 : l1.next;
            l2 = (l2 == null) ? pHead1 : l2.next;
        }
        return l1;
    }
}
