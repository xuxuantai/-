package ��ָoffer;

import java.util.PriorityQueue;

/**
 * Created by LaoP on 2019/7/8.
 */
public class �������е���λ�� {
    public class Solution {
        /**
         * ʹ�������ѽ������
         */
        //��λ������Ϊ�󶥶�
        private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
        //��λ������ΪС����
        private PriorityQueue<Integer> right = new PriorityQueue<>();
        //��¼����������
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
