package ��ָoffer;

/**
 * Created by LaoP on 2019/7/11.
 */
public class ���� {
    /**
     * ��̬�滮
     * ��һ������ֻ����ǰ��һ����������2,3,5����
     * ÿ��ѭ��ѡ����dp[i]��С����һ������
     * @param index
     * @return
     */
    public static int GetUglyNumber_Solution(int index) {
        if(index <= 6){
            return index;
        }
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        int[] dp = new int[index];
        dp[0] = 1;
        for (int i = 1; i < index; i++) {
            //ÿ��ѭ�����������2,3,5��������µ���һ������������С�ĸ���dp����,�������������ļ���
            dp[i] = Math.min(dp[t2] * 2,Math.min(dp[t3] * 3, dp[t5] * 5));
            if(dp[i] == dp[t2] * 2) t2++;
            if(dp[i] == dp[t3] * 3) t3++;
            if(dp[i] == dp[t5] * 5) t5++;
        }
        return dp[index - 1];
    }

    public static void main(String[] args) {
        System.out.print(GetUglyNumber_Solution(7));
    }
}
