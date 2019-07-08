package ��ָoffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LaoP on 2019/7/8.
 */
public class �����е�һ�����ظ����� {
    public class Solution {

        /**
         * һ�������¼�ַ��ĳ��ִ���
         * һ�����м�¼���ֹ����ַ�
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
            //ѭ������queue�ж��Ǽ���Ϊ1���ַ�
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce() {
            return queue.isEmpty() ? '#':queue.peek();
        }
    }


}
