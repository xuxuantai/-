package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LaoP on 2019/7/8.
 */
public class 数组中第一个不重复的数 {
    public class Solution {

        /**
         * 一个数组记录字符的出现次数
         * 一个队列记录出现过的字符
         */
        private int[] cnt = new int[1000];
        private Queue<Character> queue = new LinkedList<>();

        //Insert one char from stringstream
        public void Insert(char ch) {
            cnt[ch]++;
            queue.add(ch);
            while (!queue.isEmpty() && cnt[queue.peek()] > 1){
                queue.poll();
            }
            //循环过后queue中都是计数为1的字符
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce() {
            return queue.isEmpty() ? '#':queue.peek();
        }
    }


}
