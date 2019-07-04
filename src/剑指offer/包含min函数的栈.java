package 剑指offer;

import java.util.Stack;

/**
 * Created by LaoP on 2019/7/4.
 */
public class 包含min函数的栈 {

    public class Solution {
        private Stack<Integer> datastack = new Stack<>();
        private Stack<Integer> minstack = new Stack<>();

        public void push(int node) {
            datastack.push(node);
            minstack.push(minstack.isEmpty() ? node : Math.min(node,minstack.peek()));

        }

        public void pop() {
            datastack.pop();
            minstack.pop();
        }

        public int top() {
            return datastack.peek();
        }

        public int min() {
            return minstack.peek();

        }
    }
}
