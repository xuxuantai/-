package 剑指offer;

public class 复杂链表的复制 {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public class Solution {
        public RandomListNode Clone(RandomListNode pHead){

            /**
             * 思路氛围三步
             * 1.在每个节点后插入一个复制节点
             * 2.确定复制的节点random的指向
             * 3.拆分链表
             */
            if(pHead == null){
                return null;
            }
            //复制节点
            RandomListNode cur = pHead;//从头开始
            while (cur != null){
                //新建一个clone节点，值为当前节点的值
                RandomListNode clone = new RandomListNode(cur.label);
                clone.next = cur.next;
                cur.next = clone;
                //向后移动cur节点，进行下一步
                cur = clone.next;
            }
            //确定random指向
            cur = pHead;//从头开始
            while(cur != null){
                RandomListNode clone = cur.next;
                if(cur.random != null){
                    clone.random = cur.random.next;
                }
                //向后移动cur节点，进行下一步
                cur = clone.next;
            }
            //拆分链表
            cur = pHead;
            RandomListNode result = pHead.next;
            //此时循环的条件变为next不为空
            while (cur.next != null){
                //遍历需要存储一下cur.next节点，因为会改变cur.next的值
                RandomListNode next = cur.next;
                cur.next = cur.next.next;
                cur = next;
            }
            return result;

        }
    }
}
