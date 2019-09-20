package beike;

import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] nums = new int[rows][cols];
            int[][] dp = new int[rows][cols];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    nums[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < nums.length; i++) {
                Arrays.fill(dp[i], 1);
            }

            dp[0][0] = nums[0][0];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if(i == 0 && j == 0){
                        dp[i][j] = nums[i][j];
                    }else if(i == 0){
                        dp[i][j] = dp[i][j - 1] + nums[i][j];
                    }else if(j == 0){
                        dp[i][j] = dp[i - 1][j] + nums[i][j];
                    }else{
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + nums[i][j];
                    }

                }
            }
            System.out.println(dp[rows - 1][cols - 1]);
        }
    }
}
