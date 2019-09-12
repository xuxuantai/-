package offer66;


import util.ListNode;
import java.util.ArrayList;

public class No6从尾到头打印链表 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = new ListNode(0);
        while(listNode != null){
            /**
             * 头插法，重点
             */
            ListNode temp = listNode.next;// 先保存一下遍历的下一个节点，防止丢失
            listNode.next =  head.next;
            head.next = listNode;
            listNode = temp;
        }
        //此时head.next为新链表的头结点
        ArrayList<Integer> result = new ArrayList<Integer>();
        head = head.next;
        while(head != null){
            result.add(head.val);
            head = head.next;
        }
        return result;



    }
}
