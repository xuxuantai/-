package ��ָoffer;

/**
 * Created by LaoP on 2019/7/1.
 */
public class ɾ���������ظ��Ľڵ� {

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
                //ɾ���ظ���ֱ�����ظ�
                while(next != null && pHead.val == next.val){
                    //���ж�nextΪ��Ϊ�����ж�next.val�����򣬻��ָ��
                    next = next.next;
                }
                //�������һ���ڵ��ȥ��
                return deleteDuplication(next);
            }else {
                //���ظ���ɾ������nextȥ��
                pHead.next = deleteDuplication(next);
                //��������
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
//                //��ɾ���ڵ㲻�����һ���ڵ�
//                tobeDelete.val = tobeDelete.next.val;
//                tobeDelete.next = tobeDelete.next.next;
//            }else{
//                ListNode cur = head;
//                while (cur.next != tobeDelete){
//                    cur = head.next;
//                }
//                //cur�����������ڶ����ڵ�ʱ�˳���ɾ�����һ���ڵ�
//                cur.next = null;
//            }
//            return head;
//        }
    }
}
