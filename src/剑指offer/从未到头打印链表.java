package ���ݽṹ�㷨;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by LaoP on 2019/3/5.
 */
public class ��δ��ͷ��ӡ���� {
    /**
     * ��Ŀ����
     ��β��ͷ��������ӡ��ÿ������ֵ��
     *����˼·
     �ݹ飬ͷ�巨��ʹ��ջ
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        //�ݹ�
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next()));
            ret.add(listNode.val);
        }
        return ret;
    }

    public ArrayList<Integer> printListFromTailHand(ListNode listNode){
        //ʹ��ջ
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while(!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }


}
