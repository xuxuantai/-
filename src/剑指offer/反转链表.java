package 剑指offer;

public class 反转链表 {
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
                next = head.next;//保存当前节点的下一个节点，以便断开后能找到
                head.next = pre;//当前节点指向pre，pre初始为Null
                //将pre和head推进，即当前节点head变为pre，当前节点的next变为head
                pre = head;
                head = next;
            }
            //因为退出循环时候，head已经是null了，所以返回pre
            return pre;

        }
    }
}
