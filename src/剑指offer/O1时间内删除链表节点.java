package 剑指offer;

/**
 * Created by LaoP on 2019/7/1.
 */
public class O1时间内删除链表节点 {

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
            //待删除节点不是最后一个节点
           tobeDelete.val = tobeDelete.next.val;
           tobeDelete.next = tobeDelete.next.next;
        }else{
            ListNode cur = head;
            while (cur.next != tobeDelete){
                cur = head.next;
            }
            //cur搜索到倒数第二个节点时退出，删除最后一个节点
            cur.next = null;
        }
        return head;
    }
}
