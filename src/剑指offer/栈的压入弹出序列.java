package 剑指offer;

import java.util.Stack;

/**
 * Created by LaoP on 2019/7/4.
 */
public class 栈的压入弹出序列 {
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            int stackLen = pushA.length;
            Stack<Integer> stack = new Stack<>();
            for(int pushIndex = 0,popIndex = 0; pushIndex < stackLen; pushIndex++){
                stack.push(pushA[pushIndex]);
                //当出栈序列未验证结束
                //当stack不为空，为空会输出null
                //当stack的栈顶与popA当前位相等
                //出栈
                while(popIndex < stackLen && !stack.isEmpty() && stack.peek() == popA[popIndex]){
                    stack.pop();
                    popIndex++;
                }
            }
            //进行一次进栈操作，并在出栈时判断是否与出栈序列相等

            //如果stack还有残留，则popA不是一种出栈序列
            return stack.isEmpty();
        }
    }
}
