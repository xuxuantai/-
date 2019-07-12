package 剑指offer;

/**
 * Created by LaoP on 2019/7/11.
 */
public class 丑数 {
    /**
     * 动态规划
     * 下一个丑数只能是前边一个丑数乘以2,3,5生成
     * 每次循环选择赋予dp[i]最小的下一个丑数
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
            //每次循环，都计算出2,3,5三种情况下的下一个丑数，将最小的赋予dp数组,并自增这个情况的计数
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
