package LeetCode;

public class 等差数列划分 {
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        for(int i = 2; i < A.length; i++){
            if(A[i] - A[i - 1] == A[i - 1] - A[i - 2]){
                dp[i] = dp[i - 1] + 1;
            }
        }
        int result = 0;
        for(int cnt : dp){
            result += cnt;
        }
        return result;
    }
}
