package ��ָoffer;

import java.util.Stack;

/**
 * Created by LaoP on 2019/7/4.
 */
public class ջ��ѹ�뵯������ {
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            int stackLen = pushA.length;
            Stack<Integer> stack = new Stack<>();
            for(int pushIndex = 0,popIndex = 0; pushIndex < stackLen; pushIndex++){
                stack.push(pushA[pushIndex]);
                //����ջ����δ��֤����
                //��stack��Ϊ�գ�Ϊ�ջ����null
                //��stack��ջ����popA��ǰλ���
                //��ջ
                while(popIndex < stackLen && !stack.isEmpty() && stack.peek() == popA[popIndex]){
                    stack.pop();
                    popIndex++;
                }
            }
            //����һ�ν�ջ���������ڳ�ջʱ�ж��Ƿ����ջ�������

            //���stack���в�������popA����һ�ֳ�ջ����
            return stack.isEmpty();
        }
    }
}
