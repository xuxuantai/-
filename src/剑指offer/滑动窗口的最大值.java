package ��ָoffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class �������ڵ����ֵ {
    /**
     * ʹ�ô󶥶���Ϊ��������
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if(size <= 0 || size > num.length){
            return result;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) {
            heap.add(num[i]);
        }
        result.add(heap.peek());
        for (int i = 0, j = i + size; j < num.length; i++, j++) {
            heap.add(num[j]);
            heap.remove(num[i]);
            result.add(heap.peek());
        }
        return result;
    }
}
