package ��ָoffer;

public class ԲȦ�����ʣ�µ��� {
    /**
     * Լɪ�򻷵�����
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0){
            return -1;
        }
        if(n == 1){
            return 0;
        }
        /**
         * n�����Ľ������n-1�����Ľ��+m�������ǻ�����Ҫģn
         */
        return (LastRemaining_Solution(n - 1, m) + m) % n;

    }
}
