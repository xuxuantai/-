package 剑指offer;

/**
 * Created by LaoP on 2019/7/1.
 */
public class 删除链表中重复的节点 {

    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode deleteDuplication(ListNode pHead){
            if(pHead == null || pHead.next == null){
                return pHead;
            }
            ListNode next = pHead.next;
            if(pHead.val == next.val){
                //删除重复的直到不重复
                while(next != null && pHead.val == next.val){
                    //先判断next为不为空再判断next.val，否则，会空指针
                    next = next.next;
                }
                //返回最后一个节点的去重
                return deleteDuplication(next);
            }else {
                //不重复则不删除，对next去重
                pHead.next = deleteDuplication(next);
                //返回链表
                return pHead;
            }

        }

//        public ListNode deletenode(ListNode head,ListNode tobeDelete){
//            if(head == null || tobeDelete == null){
//                return null;
//            }
//            if(head == tobeDelete){
//                return null;
//            }
//            if(tobeDelete.next != null){
//                //待删除节点不是最后一个节点
//                tobeDelete.val = tobeDelete.next.val;
//                tobeDelete.next = tobeDelete.next.next;
//            }else{
//                ListNode cur = head;
//                while (cur.next != tobeDelete){
//                    cur = head.next;
//                }
//                //cur搜索到倒数第二个节点时退出，删除最后一个节点
//                cur.next = null;
//            }
//            return head;
//        }
    }
}
