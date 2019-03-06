package 数据结构算法;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by LaoP on 2019/3/5.
 */
public class 从未到头打印链表 {
    /**
     * 题目描述
     从尾到头反过来打印出每个结点的值。
     *解题思路
     递归，头插法，使用栈
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        //递归
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next()));
            ret.add(listNode.val);
        }
        return ret;
    }

    public ArrayList<Integer> printListFromTailHand(ListNode listNode){
        //使用栈
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
