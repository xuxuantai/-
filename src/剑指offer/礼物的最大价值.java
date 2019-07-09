package 剑指offer;

/**
 * Created by LaoP on 2019/7/9.
 */
public class 礼物的最大价值 {

    /**
     * 经典动态规划
     */
    public class Bonus {
        public int getMost(int[][] board) {
            int[][] dp = new int[100][100];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if(i == 0 && j == 0){
                        dp[i][j] = board[i][j];
                    }else if(i == 0){
                        dp[i][j] = dp[i][j - 1] + board[i][j];
                    }else if(j == 0){
                        dp[i][j] = dp[i - 1][j] + board[i][j];
                    }else{
                        dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]) + board[i][j];
                    }
                }
            }
            return dp[board.length - 1][board.length - 1];
        }
    }
}
