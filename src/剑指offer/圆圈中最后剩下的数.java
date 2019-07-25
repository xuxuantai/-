package 剑指offer;

public class 圆圈中最后剩下的数 {
    /**
     * 约瑟夫环的问题
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0){
            return -1;
        }
        if(n == 1){
            return 0;
        }
        /**
         * n个数的结果等于n-1个数的结果+m，由于是环，需要模n
         */
        return (LastRemaining_Solution(n - 1, m) + m) % n;

    }
}
