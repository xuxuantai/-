package 剑指offer;

public class 链表中环的入口节点 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead) {
            if(pHead == null || pHead.next == null || pHead.next.next == null){
                return null;
            }

            ListNode p1 = pHead.next.next;
            ListNode p2 = pHead.next;

            while (p1 != p2){
                if(p1.next.next != null && p2.next != null){
                    p1 = p1.next.next;
                    p2 = p2.next;
                }else {
                    return null;
                }
            }

            p1 = pHead;
            while (p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;

        }
    }
}
