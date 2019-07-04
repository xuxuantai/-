package 剑指offer;

public class 链表的倒数第K个节点 {
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
                //p1到达第k个的节点只需要走k-1步
                if(p1.next != null){
                    p1 = p1.next;
                }else {
                    return null;
                }
            }
            while (p1.next != null){
                //当p1的下一个节点为null则p1到达链表尾部，p2到达倒数第k个节点
                p1 = p1.next;
                p2 = p2.next;
            }
            return p2;

        }
    }

}
