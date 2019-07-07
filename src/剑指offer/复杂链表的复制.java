package ��ָoffer;

public class ��������ĸ��� {

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
             * ˼·��Χ����
             * 1.��ÿ���ڵ�����һ�����ƽڵ�
             * 2.ȷ�����ƵĽڵ�random��ָ��
             * 3.�������
             */
            if(pHead == null){
                return null;
            }
            //���ƽڵ�
            RandomListNode cur = pHead;//��ͷ��ʼ
            while (cur != null){
                //�½�һ��clone�ڵ㣬ֵΪ��ǰ�ڵ��ֵ
                RandomListNode clone = new RandomListNode(cur.label);
                clone.next = cur.next;
                cur.next = clone;
                //����ƶ�cur�ڵ㣬������һ��
                cur = clone.next;
            }
            //ȷ��randomָ��
            cur = pHead;//��ͷ��ʼ
            while(cur != null){
                RandomListNode clone = cur.next;
                if(cur.random != null){
                    clone.random = cur.random.next;
                }
                //����ƶ�cur�ڵ㣬������һ��
                cur = clone.next;
            }
            //�������
            cur = pHead;
            RandomListNode result = pHead.next;
            //��ʱѭ����������Ϊnext��Ϊ��
            while (cur.next != null){
                //������Ҫ�洢һ��cur.next�ڵ㣬��Ϊ��ı�cur.next��ֵ
                RandomListNode next = cur.next;
                cur.next = cur.next.next;
                cur = next;
            }
            return result;

        }
    }
}
