package 剑指offer;

import java.util.PriorityQueue;

/**
 * Created by LaoP on 2019/7/8.
 */
public class 数据流中的中位数 {
    public class Solution {
        /**
         * 使用两个堆解决问题
         */
        //中位数往左为大顶堆
        private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
        //中位数往右为小顶堆
        private PriorityQueue<Integer> right = new PriorityQueue<>();
        //记录数据流长度
        private int cnt = 0;

        public void Insert(Integer num) {
            if(cnt % 2 == 0){
                left.add(num);
                right.add(left.poll());
            }else{
                right.add(num);
                left.add(right.poll());
            }
            cnt++;
        }
        public Double GetMedian() {
            if(cnt % 2 == 0){
                return (left.peek() + right.peek())/2.0;
            }else {
                return right.peek()/1.0;
            }
        }
    }
}
