package ��ָoffer;

/**
 * Created by LaoP on 2019/7/1.
 */
public class O1ʱ����ɾ������ڵ� {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public ListNode deletenode(ListNode head,ListNode tobeDelete){
        if(head == null || tobeDelete == null){
            return null;
        }
        if(head == tobeDelete){
            return null;
        }
        if(tobeDelete.next != null){
            //��ɾ���ڵ㲻�����һ���ڵ�
           tobeDelete.val = tobeDelete.next.val;
           tobeDelete.next = tobeDelete.next.next;
        }else{
            ListNode cur = head;
            while (cur.next != tobeDelete){
                cur = head.next;
            }
            //cur�����������ڶ����ڵ�ʱ�˳���ɾ�����һ���ڵ�
            cur.next = null;
        }
        return head;
    }
}
