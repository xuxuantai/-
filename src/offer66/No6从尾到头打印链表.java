package offer66;


import util.ListNode;
import java.util.ArrayList;

public class No6��β��ͷ��ӡ���� {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = new ListNode(0);
        while(listNode != null){
            /**
             * ͷ�巨���ص�
             */
            ListNode temp = listNode.next;// �ȱ���һ�±�������һ���ڵ㣬��ֹ��ʧ
            listNode.next =  head.next;
            head.next = listNode;
            listNode = temp;
        }
        //��ʱhead.nextΪ�������ͷ���
        ArrayList<Integer> result = new ArrayList<Integer>();
        head = head.next;
        while(head != null){
            result.add(head.val);
            head = head.next;
        }
        return result;



    }
}
