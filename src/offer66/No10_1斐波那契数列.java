package offer66;

public class No10_1ì³²¨ÄÇÆõÊıÁĞ {
    public int Fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
